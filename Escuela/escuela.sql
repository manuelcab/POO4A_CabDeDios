CREATE TABLE estudiantes (
    id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY, 
    nombre VARCHAR(25) NOT NULL , 
    apellido VARCHAR(25) NOT NULL , 
    edad VARCHAR(2) NOT NULL , 
    genero VARCHAR(10) NOT NULL , 
    direccion VARCHAR(150) NOT NULL , 
    telefono VARCHAR(10) NOT NULL , 
    correo VARCHAR(100) NOT NULL , 
    matricula VARCHAR(10) NOT NULL , 
    facultad VARCHAR(50) NOT NULL , 
    carrera VARCHAR(50) NOT NULL , 
    semestre VARCHAR(15) NOT NULL , 
    promedio VARCHAR(10) NOT NULL , 
    grupo VARCHAR(10) NOT NULL 
);

CREATE TABLE docentes (
    id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(25) NOT NULL ,
    apellido VARCHAR(25) NOT NULL ,
    edad VARCHAR(2) NOT NULL ,
    genero VARCHAR(10) NOT NULL ,
    direccion VARCHAR(150) NOT NULL ,
    telefono VARCHAR(10) NOT NULL ,
    correo VARCHAR(100) NOT NULL ,
    numero_empleado VARCHAR(10) NOT NULL ,
    materia VARCHAR(20) NOT NULL ,
    horas VARCHAR(10) NOT NULL ,
    grado_academico VARCHAR(20) NOT NULL ,
    certificaciones VARCHAR(100) NOT NULL ,
    idiomas VARCHAR(50) NOT NULL ,
    salario VARCHAR(10) NOT NULL
);
