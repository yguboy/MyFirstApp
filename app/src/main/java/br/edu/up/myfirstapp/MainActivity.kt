package br.edu.up.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickTraducer(view: View) {
        //Função para traduzir o "Hello World!" para o português...
        var txtBox: TextView = findViewById(R.id.textView)
        txtBox.text = "Olá Mundo!"
    }
}