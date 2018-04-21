package br.com.felipefriserio.motoapi.service

import br.com.felipefriserio.motoapi.entity.Moto
import br.com.felipefriserio.motoapi.repository.MotoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class MotoService{
    @Autowired
    lateinit var motoRepository : MotoRepository

    fun buscarPorMarca(marca : String) : List<Moto>{
        return motoRepository.findByMarcaContaining(marca)
    }

    fun buscarPorAno(ano: Int) : List<Moto>{
        return motoRepository.findByAno(ano)
    }

    fun buscarPorPlaca(placa:String) : Moto{
        return motoRepository.findByPlaca(placa)
    }

    fun buscarTodos(): List<Moto>{
        return motoRepository.findAll()
    }

    fun salvar(moto : Moto){
        motoRepository.save(moto)
    }

    fun deletar(placa : String){
        motoRepository.deleteById(placa)
    }

    fun deletar(moto : Moto){
        motoRepository.delete(moto)
    }
}
