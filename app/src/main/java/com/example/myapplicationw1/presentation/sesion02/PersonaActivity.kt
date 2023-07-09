package com.example.myapplicationw1.presentation.sesion02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationw1.R
import com.example.myapplicationw1.databinding.ActivityPersonaBinding

class PersonaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPersonaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_persona)
        binding = ActivityPersonaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        obtenerDatos()
    }

    fun obtenerDatos() {
        var nombres = intent.getStringExtra("nombres")
        var apellidos = intent.getStringExtra("apellidos")
        var edad = intent.getIntExtra("edad", 0)
        var nota1 = intent.getDoubleExtra("nota1", 0.0)
        var aprobado = intent.getBooleanExtra("aprobado", false)

        binding.tvDatosPersona.text = nombres + " " + apellidos + " " + edad

    }
}
