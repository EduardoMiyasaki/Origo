package com.lacos_preciosos.preciososLacos.repository

import com.lacos_preciosos.preciososLacos.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository: JpaRepository<Usuario, Int> {
    
   /* fun findByNomeContains(nome: String): List<Usuario>
    fun findByEmail(email: String): Usuario?
    fun findByCpf(cpf: String): Usuario?
    fun findByTelefone(telefone: String): Usuario?*/
}