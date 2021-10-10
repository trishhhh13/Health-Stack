package com.trishala13kohad.healthstack

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var bottomNavMenu: BottomNavigationView
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var toolBar: Toolbar
    private lateinit var navDrawer: NavigationView
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavMenu = findViewById(R.id.bottom_nav_menu)
        navDrawer = findViewById(R.id.nav_drawer)
        drawerLayout = findViewById(R.id.drawer_layout)
        toolBar = findViewById(R.id.toolbar)

        setSupportActionBar(toolBar)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
        as NavHostFragment

        navController = navHostFragment.navController
        appBarConfiguration = AppBarConfiguration(setOf(R.id.caloriesFragment, R.id.waterReminderFragment,
        R.id.pedometerFragment), drawerLayout)

        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavMenu.setupWithNavController(navController)
        navDrawer.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}