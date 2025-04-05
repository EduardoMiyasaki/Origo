package com.lacos_preciosos.preciososLacos.repository

import com.lacos_preciosos.preciososLacos.model.Modelo
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ModeloRepository : JpaRepository<Modelo, Int> {

    fun findByNomeModeloContainingIgnoreCase(nomeModelo: String): Optional<Modelo>
}