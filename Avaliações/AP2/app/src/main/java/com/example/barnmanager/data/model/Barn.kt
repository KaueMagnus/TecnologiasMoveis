package com.example.barnmanager.data.model

import java.io.Serializable

data class Barn(
    val id: Int,
    val nome: String,
    val descricao: String,
    val quantidade: Int,
    val categoria: String
) : Serializable