package com.example.comppanionclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  Clases.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main(){
    val scaryMovie = Movie ("scary movie","comedia",88.27)
    println(scaryMovie)
    //println(scaryMovie.name)
    scaryMovie.createAt = "2000"
    //println("fecha de creacion: ${scaryMovie.createAt}")
    println(scaryMovie.createAt)
    //Desestructuration
    val (nameS,genderS,durationS) = scaryMovie
    println("La duracion de la pelicula es de $durationS minutos Names: $nameS Genero: $genderS")

    //Copiar variables de un data class
    val scaryMovie2 =scaryMovie.copy(name="sca movie 2",duration=83.0)
    println("""
        Scary movie: $scaryMovie
        Scary movie2: $scaryMovie2
    """.trimIndent())
    //Companions objects esto e ya de la otra clase
}
