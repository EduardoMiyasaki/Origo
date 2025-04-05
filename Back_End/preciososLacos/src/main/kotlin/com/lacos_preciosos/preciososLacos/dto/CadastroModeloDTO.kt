package com.lacos_preciosos.preciososLacos.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class CadastroModeloDTO(

    @field:NotBlank(message = "O nome do modelo não pode ser vazio")
    val nome: String,
    @field:NotNull(message = "O preço do modelo não pode ser nulo")
    val preco: Double,
    @field:NotBlank(message = "A descrição do modelo não pode ser vazia")
    val descricao: String,
    val foto: String
) {
}