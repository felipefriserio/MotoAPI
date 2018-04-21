package br.com.felipefriserio.motoapi.repository

import br.com.felipefriserio.motoapi.entity.Moto
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MotoRepository : MongoRepository<Moto, String>{
    fun findByAno(ano : Int): List<Moto>

    fun findByMarcaContaining(marca:String) : List<Moto>

    fun findByPlaca(placa:String) : Moto
}