package com.lacos_preciosos.preciososLacos.dto

import com.lacos_preciosos.preciososLacos.model.Modelo
import lombok.NoArgsConstructor

@NoArgsConstructor
data class DadosDetalheModelo(
    var nomeModelo: String,
    var preco: Double,
    var descricao: String,
    var foto: String
) {
   constructor(modelo: Modelo): this(
       modelo.nomeModelo,
       modelo.preco,
       modelo.descricao,
       modelo.foto
   )
}
