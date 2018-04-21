package br.com.felipefriserio.motoapi.controller

import br.com.felipefriserio.motoapi.entity.Moto
import br.com.felipefriserio.motoapi.service.MotoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/moto")

class MotoController{

    @Autowired
    lateinit var motoService: MotoService

    @GetMapping()
    fun buscarTodos() : List<Moto>{
        return motoService.buscarTodos()
    }

    @GetMapping("/find/{placa}")
    fun buscarPorPlaca(@PathVariable("placa") placa : String) : Moto{
        return motoService.buscarPorPlaca(placa)
    }

    @PostMapping
    fun salvar(@RequestBody moto : Moto){
        motoService.salvar(moto)
    }

    @DeleteMapping("/delete/{placa}")
    fun deletar(@PathVariable("placa") placa : String){
        motoService.deletar(placa)
    }


}