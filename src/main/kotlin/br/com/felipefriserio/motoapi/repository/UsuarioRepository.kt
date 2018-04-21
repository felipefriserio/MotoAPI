package br.com.felipefriserio.motoapi.repository

import br.com.felipefriserio.motoapi.entity.Moto
import br.com.felipefriserio.motoapi.entity.Usuario
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository : MongoRepository<Usuario, String>{
    fun findByCpf(cpf : String) : Usuario
}