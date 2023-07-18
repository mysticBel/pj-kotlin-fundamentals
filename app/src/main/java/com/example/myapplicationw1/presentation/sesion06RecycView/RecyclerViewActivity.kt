package com.example.myapplicationw1.presentation.sesion06RecycView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationw1.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}