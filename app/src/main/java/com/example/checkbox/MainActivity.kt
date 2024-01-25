package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import com.example.checkbox.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mostrarResultado(view: View) {
        var superNintendo: CheckBox = findViewById(R.id.check_super_nintendo)
        var megaDrive: CheckBox = findViewById(R.id.check_mega_drive)
        var nintendo64: CheckBox = findViewById(R.id.check_nintendo_64)
        var masterSystem: CheckBox = findViewById(R.id.check_Master_System)
        var atari: CheckBox = findViewById(R.id.check_atari)
        var dreamcast: CheckBox = findViewById(R.id.check_dreamcast)
        var psOne: CheckBox = findViewById(R.id.check_PS_one)

        var resultado: TextView = findViewById(R.id.resultado)

        var videoGames: ArrayList<String> = arrayListOf()

        if (superNintendo.isChecked) {
            videoGames.add("Super Nintendo")
        } else {
            videoGames.remove("Super Nintendo")
        }

        if (megaDrive.isChecked) {
            videoGames.add("Mega Drive")
        } else {
            videoGames.remove("Mega Drive")
        }

        if (nintendo64.isChecked) {
            videoGames.add("Nintendo 64")
        } else {
            videoGames.remove("Nintendo 64")
        }

        if (masterSystem.isChecked) {
            videoGames.add("MasterSystem")
        } else {
            videoGames.remove("Master System")
        }

        if (atari.isChecked) {
            videoGames.add("Atari")
        } else {
            videoGames.remove("Atari")
        }

        if (dreamcast.isChecked) {
            videoGames.add("Dreamcast")
        } else {
            videoGames.remove("Dreamcast")
        }

        if (psOne.isChecked) {
            videoGames.add("PS One")
        } else {
            videoGames.remove("PS One")
        }

        resultado.text = videoGames.toString()
    }
}