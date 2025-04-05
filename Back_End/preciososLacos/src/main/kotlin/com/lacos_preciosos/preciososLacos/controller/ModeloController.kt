package com.lacos_preciosos.preciososLacos.controller

import com.lacos_preciosos.preciososLacos.dto.CadastroModeloDTO
import com.lacos_preciosos.preciososLacos.dto.DadosDetalheModelo
import com.lacos_preciosos.preciososLacos.model.Modelo
import com.lacos_preciosos.preciososLacos.service.ModeloService
import com.lacos_preciosos.preciososLacos.validacao.ValidacaoException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/modelos")
class ModeloController(private val modeloService: ModeloService) {

    @GetMapping
    fun getAllModelos(): ResponseEntity<List<Modelo>> {

        val modelos = modeloService.getAllModelos()

        return if (modelos.isEmpty()) {
            ResponseEntity.status(204).build()
        } else {
            ResponseEntity.status(200).body(modelos)
        }
    }

    @GetMapping("/{id}")
    fun getOneModelo(@PathVariable id: Int): ResponseEntity<Modelo> {
        return ResponseEntity.of(modeloService.getOneModelo(id))
    }

    @GetMapping("/pesquisa-nome")
    fun getModeloByName(@RequestParam nome: String): ResponseEntity<Modelo> {
        val modelo = modeloService.getModeloByNome(nome)

        return ResponseEntity.of(modelo)
    }

    @PostMapping
    fun createModelo(@RequestBody criacaoModeloDTO: CadastroModeloDTO): ResponseEntity<DadosDetalheModelo> {
        return ResponseEntity.status(201).body(modeloService.createModelo(criacaoModeloDTO))
    }

    @PutMapping("/{id}")
    fun updateModelo(
        @PathVariable id: Int,
        @RequestBody criacaoModeloDTO: CadastroModeloDTO
    ): ResponseEntity<DadosDetalheModelo> {

        try {
            return ResponseEntity.status(200).body(modeloService.updateModelo(id, criacaoModeloDTO))
        } catch (ex: ValidacaoException) {
            return ResponseEntity.status(404).build()
        }
    }

    @DeleteMapping("/{id}")
    fun deleteModelo(@PathVariable id: Int): ResponseEntity<Void> {
        try {
            modeloService.deleteModelo(id)
            return ResponseEntity.status(204).build()
        } catch (ex: ValidacaoException) {
            return ResponseEntity.status(404).build()
        }
    }
}