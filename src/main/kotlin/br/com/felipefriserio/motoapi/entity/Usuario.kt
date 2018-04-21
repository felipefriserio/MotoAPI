package br.com.felipefriserio.motoapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Usuario(@Id var cpf: String,
                   var email: String,
                   var password: String,
                   var name: String) {
}