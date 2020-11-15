package kg.nurik.sambo.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.nurik.sambo.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()


    }
}