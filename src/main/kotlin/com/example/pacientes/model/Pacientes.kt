package com.example.pacientes.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "pacientes")
class Pacientes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nombre: String? = null
    var apellido: String? = null
    var fec_nac: Date? = null
    var sexo: String? = null
    var tipo_sangre: String? = null
    var direccion: String? = null
    var telefono: String? = null
}
