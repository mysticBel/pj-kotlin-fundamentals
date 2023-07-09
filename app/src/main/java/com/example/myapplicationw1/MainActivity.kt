package com.example.myapplicationw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplicationw1.databinding.ActivityMainBinding
import com.example.myapplicationw1.presentation.dialogos.DialogoActivity
import com.example.myapplicationw1.presentation.sesion02.PersonaActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // desde el activity_main.xml (el id)
        binding.tvHolaMundo.text = "Hola Mundo de prueba"

        //separamos por funciones
        initEvents()
    }

    fun initEvents(){
        binding.btnPersonaActivity.setOnClickListener {
            Log.d("btnPersonAct", "Me presionaste >:)")
            //como si fuese el console.log

            // vamos a ir a person activity
            startActivity(
                Intent(this, PersonaActivity::class.java).apply{
                    //Enviaremos datos desde mainActivity  a Persona Activity
                    putExtra("nombres", "Maribel")
                    putExtra("apellidos", "Maza Auccatinco")
                    putExtra("edad", 28)
                    putExtra("nota1", 18.5)
                    putExtra("aprobado", true)


                }
            )

        }


        //w4
        binding.btnDialogos.setOnClickListener{
            startActivity(
                Intent(this, DialogoActivity::class.java)
            )
        }
    }
}