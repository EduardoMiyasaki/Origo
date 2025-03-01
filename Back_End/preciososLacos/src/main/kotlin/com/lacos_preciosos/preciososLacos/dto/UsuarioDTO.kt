package com.lacos_preciosos.preciososLacos.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@JsonIgnoreProperties
data class UsuarioDTO(
    var nome: String,
    var email: String,
    var cep: String,
    var numeroCasa: Int
)