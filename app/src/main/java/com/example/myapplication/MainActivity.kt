package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {


    lateinit var drawerLayout: DrawerLayout
    lateinit var toolbar: Toolbar
    lateinit var frameLayout: FrameLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var navigationview: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawerlayout)
        toolbar = findViewById(R.id.toolbar)
        frameLayout = findViewById(R.id.frame)
        coordinatorLayout = findViewById(R.id.coordinatorLayout)
        navigationview = findViewById(R.id.navigation)
        setUpToolbar()

        val actionBarDrawerToggle=ActionBarDrawerToggle(this@MainActivity,drawerLayout,
            R.string.Open_Drawer,R.string.Close_Drawer)

        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        navigationview.setNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.dashboard->
                {
                    Toast.makeText(this@MainActivity,"Toast created",Toast.LENGTH_SHORT).show()
                }
                R.id.favourites->
                {
                    Toast.makeText(this@MainActivity,"Toast created",Toast.LENGTH_SHORT).show()
                }
                R.id.profile->
                {
                    Toast.makeText(this@MainActivity,"Toast created",Toast.LENGTH_SHORT).show()
                }
                R.id.aboutapp->
                {
                    Toast.makeText(this@MainActivity,"Toast created",Toast.LENGTH_SHORT).show()
                }
            }
            return@setNavigationItemSelectedListener true
        }
    }


    fun setUpToolbar() {

        setSupportActionBar(toolbar)
        supportActionBar?.title = "Toolbar Title"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id= item.itemId
        if(id==android.R.id.home)
        {
            drawerLayout.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }
}



