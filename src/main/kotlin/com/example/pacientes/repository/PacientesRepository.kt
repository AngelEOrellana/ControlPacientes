package com.example.pacientes.repository

import com.example.pacientes.model.Pacientes
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PacientesRepository : JpaRepository<Pacientes, Long?> {

    fun findById (id: Long?): Pacientes?

}