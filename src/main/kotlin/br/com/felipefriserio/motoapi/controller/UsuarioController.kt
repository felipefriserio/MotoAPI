package br.com.felipefriserio.motoapi.controller

import br.com.felipefriserio.motoapi.entity.Moto
import br.com.felipefriserio.motoapi.entity.Usuario
import br.com.felipefriserio.motoapi.service.UsuarioService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usuario")

class UsuarioController{

    @Autowired
    lateinit var usuarioService: UsuarioService

    @GetMapping()
    fun buscarTodos() : List<Usuario> {
        return usuarioService.buscarTodos()
    }

    @GetMapping("/find/{cpf}")
    fun buscarPorCpf(@PathVariable("cpf") cpf : String) : Usuario {
        return usuarioService.buscarPorCpf(cpf)
    }

    @PostMapping
    fun salvar(@RequestBody usuario : Usuario){
        usuarioService.salvar(usuario)
    }

    @PutMapping
    fun atualizar(@RequestBody usuario : Usuario){
        usuarioService.salvar(usuario)
    }
}