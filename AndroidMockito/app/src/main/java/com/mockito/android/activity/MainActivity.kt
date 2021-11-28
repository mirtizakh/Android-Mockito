package com.mockito.android.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mockito.android.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}