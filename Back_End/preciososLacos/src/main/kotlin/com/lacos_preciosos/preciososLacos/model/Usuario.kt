package com.lacos_preciosos.preciososLacos.model

import com.lacos_preciosos.preciososLacos.dto.UsuarioDTO
import java.time.LocalDate

class Usuario {
    var id: Int = 0;
    var nome: String = "";
    var email: String = "";
    var senha: String = "";
    var telefone: String = "";
    var data_cadastro: LocalDate;
    var cpf: String = "";

    constructor(usuarioDTO: UsuarioDTO) {
        this.nome = usuarioDTO.nome;
        this.senha = usuarioDTO.senha;
        this.telefone = usuarioDTO.telefone;
        this.data_cadastro = LocalDate.now();
        this.email = usuarioDTO.email;
        this.cpf = usuarioDTO.cpf;

    }

    override fun toString(): String {
        return "Usuario(nome='$nome', email='$email', cpf='$cpf',senha = '$senha', telefone = '$telefone', data_cadastro = $data_cadastro)"
    }

}