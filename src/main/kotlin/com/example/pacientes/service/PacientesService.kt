package com.example.pacientes.service

import com.example.pacientes.model.Pacientes
import com.example.pacientes.repository.PacientesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class PacientesService {
    @Autowired
    lateinit var pacientesRepository: PacientesRepository

    fun list ():List<Pacientes>{
        return pacientesRepository.findAll()
    }

    fun save(pacientes: Pacientes): Pacientes{
        try{
            return pacientesRepository.save(pacientes)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

    fun update(pacientes: Pacientes): Pacientes{
        try {
            pacientesRepository.findById(pacientes.id)
                ?: throw Exception("Id no existe")

            return pacientesRepository.save(pacientes)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

    fun updateName(pacientes: Pacientes): Pacientes{
        try {
            val response = pacientesRepository.findById(pacientes.id)
                ?: throw Exception("Id no existe")
            response.apply {
                nombre = pacientes.nombre
            }
            return pacientesRepository.save(response)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

    fun listById (id:Long?): Pacientes?{
        return pacientesRepository.findById(id)
    }

}