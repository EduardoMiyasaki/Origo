package com.lacos_preciosos.preciososLacos.model

import com.lacos_preciosos.preciososLacos.dto.UsuarioDTO

class Usuario {

    var nome: String = "";
    var email: String = "";
    var cep: String = "";
    var numeroCasa: Int = 1;

    constructor(usuarioDTO: UsuarioDTO) {
        this.nome = usuarioDTO.nome;
        this.email = usuarioDTO.email;
        this.cep = usuarioDTO.cep;
        this.numeroCasa = usuarioDTO.numeroCasa;
    }

    override fun toString(): String {
        return "Usuario(nome='$nome', email='$email', cep='$cep', numeroCasa=$numeroCasa)"
    }

}