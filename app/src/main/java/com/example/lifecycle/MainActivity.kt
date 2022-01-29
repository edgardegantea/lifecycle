package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast = Toast.makeText(applicationContext, "se inició el método onCreate()", Toast.LENGTH_SHORT)
        toast.show()
    }

    // onStart() del ciclo de vida de una app móvil
    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(applicationContext, "Se inició el método onStart()", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        val aviso = Toast.makeText(applicationContext, "Se inició el método onResume()", Toast.LENGTH_SHORT)
        aviso.show()
    }

    override fun onPause() {
        super.onPause()
        val avisoPausa = Toast.makeText(applicationContext, "La app ha sido pausada onPause()", Toast.LENGTH_LONG)
        avisoPausa.show()
    }

    override fun onStop() {
        super.onStop()
        val avisoDetener = Toast.makeText(applicationContext, "La app se detuvo", Toast.LENGTH_SHORT)
        avisoDetener.show()
    }

    override fun onRestart() {
        super.onRestart()
        val avisoReiniciar = Toast.makeText(applicationContext, "La app se reinició", Toast.LENGTH_SHORT)
        avisoReiniciar.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val avisoDestruccion = Toast.makeText(applicationContext, "Destruiste la app :(", Toast.LENGTH_SHORT)
        avisoDestruccion.show()
    }

    // Este es un comentario
}