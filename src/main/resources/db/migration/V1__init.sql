CREATE TABLE IF NOT EXISTS pacientes(
    id SERIAL,
    nombre VARCHAR(30),
    apellido VARCHAR(30),
    fec_nac DATE,
    sexo VARCHAR(1),
    tipo_sangre VARCHAR(3),
    direccion VARCHAR(100),
    telefono VARCHAR(20),
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS tratamientos(
    id SERIAL,
    nombre VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS citas(
    id SERIAL,
    fecha DATE,
    pacientes_id INT,
    tratamientos_id INT,
    PRIMARY KEY(ID),
    FOREIGN KEY(pacientes_id) REFERENCES pacientes(id),
    FOREIGN KEY(tratamientos_id) REFERENCES tratamientos(id)
);

