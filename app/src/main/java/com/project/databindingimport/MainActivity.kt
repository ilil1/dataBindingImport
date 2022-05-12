package com.project.databindingimport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.project.databindingimport.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val text = "Hello World!"
    var isClicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.mainactivity = this

        binding.hideButton.setOnClickListener {
            isClicked = !isClicked
            binding.invalidateAll()
        }
    }
}