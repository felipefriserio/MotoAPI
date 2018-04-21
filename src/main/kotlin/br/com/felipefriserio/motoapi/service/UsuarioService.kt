package br.com.felipefriserio.motoapi.service



import br.com.felipefriserio.motoapi.entity.Usuario
import br.com.felipefriserio.motoapi.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class UsuarioService{
    @Autowired
    lateinit var usuarioRepository : UsuarioRepository


    fun buscarPorCpf(cpf : String) : Usuario {
        return usuarioRepository.findByCpf(cpf)
    }

    fun buscarTodos() : List<Usuario>{
        return usuarioRepository.findAll()
    }

    fun salvar(usuario : Usuario){
        usuarioRepository.save(usuario)
    }

    fun deletar(cpf : String){
        usuarioRepository.deleteById(cpf)
    }
}
