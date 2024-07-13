package com.example.repechajecristianrodriguez.Model.Local.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey

//modificar parametros segun lista entregada
@Entity(tableName = "Details_Elements")
data class LocalDetails (
    @PrimaryKey
    val id: Int,
    val artista: String,
    val fecha: String,
    val lugar: String,
    val ciudad: String,
    val imagen: String,
    val entradas: String

)