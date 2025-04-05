package com.lacos_preciosos.preciososLacos.model

import com.lacos_preciosos.preciososLacos.dto.UsuarioDTO
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
class Usuario() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0;
    var nome: String = "";
    var email: String = "";
    var senha: String = "";
    var telefone: String = "";
    var data_cadastro: LocalDate? = null;
    var cpf: String = "";

    constructor(usuarioDTO: UsuarioDTO) : this() {
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