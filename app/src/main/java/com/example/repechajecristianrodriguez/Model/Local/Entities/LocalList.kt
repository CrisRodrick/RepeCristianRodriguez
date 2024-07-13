package com.example.repechajecristianrodriguez.Model.Local.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey

//modificar parametros segun lista entregada
@Entity(tableName = "List_Elements")
data class LocalList (
    @PrimaryKey
    val id: Int,
    val artista: String,
    val fecha: String,
    val lugar: String,
    val ciudad: String,
    val imagen: String,
    val entradas: String

)