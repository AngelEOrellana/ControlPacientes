package com.example.pacientes

import com.example.pacientes.model.Pacientes
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

@SpringBootApplication
class PacientesApplication

fun main(args: Array<String>) {
	runApplication<PacientesApplication>(*args)
}

