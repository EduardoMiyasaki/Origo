package com.lacos_preciosos.preciososLacos.controller

import com.lacos_preciosos.preciososLacos.dto.UsuarioDTO
import com.lacos_preciosos.preciososLacos.model.Usuario
import com.lacos_preciosos.preciososLacos.repository.UsuarioRepository
import com.lacos_preciosos.preciososLacos.service.UsuarioService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usuarios")
class UsuarioController(private val repositorio: UsuarioRepository) {

    // val usuariosList = mutableListOf<Usuario>();

  /*  @PostMapping
    fun criarUsuario(@RequestBody usuarioDTO: UsuarioDTO): ResponseEntity<Usuario> {
        val usuario = usuarioService.criarUsuario(usuarioDTO);
        usuariosList.add(usuario);
        return ResponseEntity.status(201).body(usuario)
    }*/

    //Inserindo o usuario no banco de Dados
    @PostMapping
    fun cadastrarUsuario(@RequestBody novoUsuario: Usuario): ResponseEntity<Usuario> {
        val usuario = repositorio.save(novoUsuario)
        return ResponseEntity.status(201).body(usuario)
    }

  /*  @GetMapping
    fun listarUsuario(): ResponseEntity<List<Usuario>> {
        if (usuariosList.isEmpty()) {
            return ResponseEntity.status(204).build()
        }
        return ResponseEntity.status(200).body(usuariosList)
    }

    @GetMapping("/{id}")
    fun listarPeloId(@PathVariable id: Int): ResponseEntity<Usuario> {
        if (id in 0..<usuariosList.size) {
            return ResponseEntity.status(200).body(usuariosList[id]);
        }
        return ResponseEntity.status(404).build();
    }

    @GetMapping("/nomes")
    fun listarPeloNome(@RequestParam nome: String): ResponseEntity<Usuario> {

        val usuarioEncontrado = usuariosList
            .stream()
            .filter { it.nome.lowercase().trim().contains(nome.lowercase().trim()) }
            .findFirst();

        return if (usuarioEncontrado.isPresent) {
            ResponseEntity.status(200).body(usuarioEncontrado.get())
        } else {
            ResponseEntity.status(204).build()
        }
    }

    @PutMapping("/{id}")
    fun atualizarUsuario(@PathVariable id: Int, @RequestBody usuarioDTO: UsuarioDTO): ResponseEntity<Usuario> {

        if (id in 0..<usuariosList.size) {
            val usuarioAtualizado = usuarioService.criarUsuario(usuarioDTO)
            usuariosList[id] = usuarioAtualizado
            return ResponseEntity.status(200).body(usuarioAtualizado);
        }
        return ResponseEntity.status(204).build()
    }

    @DeleteMapping("/{id}")
    fun deletarUsuario(@PathVariable id: Int): ResponseEntity<String> {

        if (id in 0..< usuariosList.size) {
            usuariosList.removeAt(id)
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }
*/
}