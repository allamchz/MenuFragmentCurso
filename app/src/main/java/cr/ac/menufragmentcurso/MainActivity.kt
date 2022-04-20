package cr.ac.menufragmentcurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


lateinit  var drawerLayout : DrawerLayout

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener,DrawerLayout.DrawerListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)


        var toggle = ActionBarDrawerToggle(this, drawerLayout,toolbar, R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        var navigationView = findViewById<NavigationView>(R.id.navigation_view)
        navigationView.setNavigationItemSelectedListener (this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        TODO("Not yet implemented")
    }

    override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
        TODO("Not yet implemented")
    }

    override fun onDrawerOpened(drawerView: View) {
        TODO("Not yet implemented")
    }

    override fun onDrawerClosed(drawerView: View) {
        TODO("Not yet implemented")
    }

    override fun onDrawerStateChanged(newState: Int) {
        TODO("Not yet implemented")
    }

}