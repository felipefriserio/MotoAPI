package br.com.felipefriserio.motoapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Moto(@Id var placa: String,
                var marca: String,
                var modelo: String,
                var ano: Int,
                var urlImagem: String)
{}

