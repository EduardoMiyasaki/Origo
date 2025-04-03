package com.lacos_preciosos.preciososLacos.model

import jakarta.persistence.*

@Entity
data class Produto(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idProduto: Int?,

    @Column(name = "nome_produto")
    var nomeProduto: String,

    var tamanho: String,

    var preco: Double,

    var material: String,

    var cor: String,

    var acabamento: String,

    var descricao: String
){
}