package com.example.easeenglish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.easeenglish.fragments.animais.AnimaisFragment
import com.example.easeenglish.fragments.numeros.NumerosFragment
import com.example.easeenglish.fragments.vogais.VogaisFragment
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems

class MainActivity : AppCompatActivity() {
    private lateinit var smartTabLayout: SmartTabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        smartTabLayout = findViewById(R.id.viewAba)
        viewPager = findViewById(R.id.viewPager)

        val adapter = FragmentPagerItemAdapter(
            supportFragmentManager,
            FragmentPagerItems.with(this)
                .add("Animais", AnimaisFragment::class.java)
                .add("numeros", NumerosFragment::class.java)
                .add("Vogais", VogaisFragment::class.java)
                .create()
        )

        viewPager.adapter = adapter
        smartTabLayout.setViewPager(viewPager)
    }
}
