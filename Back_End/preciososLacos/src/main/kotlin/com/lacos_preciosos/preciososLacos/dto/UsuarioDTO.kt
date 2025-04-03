package com.lacos_preciosos.preciososLacos.dto

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.time.LocalDate
<<<<<<< HEAD

=======
>>>>>>> 6eb11909a3b19c6596641dbb02996e8b7ae528f1

@JsonIgnoreProperties
data class UsuarioDTO(

    var nome: String,
    var email: String,
    var senha: String,
    var cpf: String,
    var telefone: String,
    @JsonIgnore var data_cadastro: LocalDate

)