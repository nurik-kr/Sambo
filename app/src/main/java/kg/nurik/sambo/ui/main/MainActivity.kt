package kg.nurik.sambo.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kg.nurik.sambo.R
import kg.nurik.sambo.ui.bottomNav.viewPager.*
import kg.nurik.sambo.ui.bottomNav.competitionFragment.CompetitionFragment
import kg.nurik.sambo.ui.bottomNav.curseFragment.CurseFragment
import kg.nurik.sambo.ui.bottomNav.mainFragment.MainFragment
import kg.nurik.sambo.ui.bottomNav.userFragment.UserFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomNav()
        setupListeners()
    }

    private fun setupBottomNav() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        ViewPager.adapter = adapter
        adapter.addFragment(MainFragment())
        adapter.addFragment(CompetitionFragment())
        adapter.addFragment(CurseFragment())
        adapter.addFragment(UserFragment())
    }

    private fun setupListeners() {
        bottomNavigation.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.main -> ViewPager.currentItem = 0
                R.id.competition -> ViewPager.currentItem = 1
                R.id.curse -> ViewPager.currentItem = 2
                R.id.my_profile -> ViewPager.currentItem = 3
            }
            true
        }
    }
}


