package com.example.myapplicationw1.presentation.dialogos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.myapplicationw1.R
import com.example.myapplicationw1.databinding.ActivityDialogoBinding
import com.example.myapplicationw1.databinding.ActivityPersonaBinding

class DialogoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDialogoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_dialogo)
        binding = ActivityDialogoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initEvents()
    }

    // w4 dialogs
    fun initEvents(){
        binding.btnDialogSimple.setOnClickListener{
            showDialogAlertSimple()
        }
        binding.btnSingleChoiceDialog.setOnClickListener{
            showSingleChoiceDialog()
        }
        binding.btnMultipleChoiceDialog.setOnClickListener{
            showMultipleChoiceDialog()
        }
    }


    fun showDialogAlertSimple() {
        AlertDialog.Builder(this)
            .setTitle("Dialogo Simple Titulo")
            .setMessage("Este es el contenido del dialogo")
            .setPositiveButton("Ok"){
                //si presiona este boton
                dialog, which ->
                    Log.d("BotonSi", "Presionaste boton Ok!")
            }
            .setNegativeButton("No"){
                //si presiona este boton
                    dialog, which ->
                Log.d("BotonNo", "Presionaste boton NO!")
            }
            .setCancelable(false)
            .show()
    }
    fun showSingleChoiceDialog() {
        val frutas : Array<String> = arrayOf("Manzana", "Pera", "Naranja", "Papaya")

        AlertDialog.Builder(this)
            .setTitle("Title Single Choice Dialog")
            .setSingleChoiceItems(frutas, 0){_,posicion ->
                //Log.d("SingleChoice", "Me presionaste una sola opcion")
                Toast.makeText(this, "Has seleccionado ${frutas[posicion]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Aceptar"){ _, _ ->

            }
            .setNegativeButton("Cancelar"){ _, _ ->

            }
            .show()
    }

    fun showMultipleChoiceDialog() {
        val frutas : Array<String> = arrayOf("Manzana", "Pera", "Naranja", "Papaya")
        AlertDialog.Builder(this)
            .setTitle("Title Multiple Choice Dialog")
            .setMultiChoiceItems(frutas, booleanArrayOf(false, false, false, false)){ dialog, posicion, seleccionado->
                //si seleccionado es true o verdadero
                if(seleccionado)
                    Toast.makeText(this, "Has seleccionado ${frutas[posicion]}", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this, "Has desSeleccionado ${frutas[posicion]}", Toast.LENGTH_SHORT).show()
                //Log.d("SingleChoice", "Me presionaste una sola opcion")

            }
            .setPositiveButton("Aceptar"){ _, _ ->

            }
            .setNegativeButton("Cancelar"){ _, _ ->

            }
            //Para que no se cierre el modal al hacer click en otro lado
            .setCancelable(false) //para que no se cierre
            .show()
    }

}