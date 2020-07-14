CREATE TABLE medico(
    RUT text PRIMARY KEY,
    nombres text,
    apellidos text,
    contrasena text, 
    sexo text, 
    especialidad text
);

CREATE TABLE paciente(
    RUT text PRIMARY KEY,
    nombres text,
    apellidos text,
    fechanacimiento date,
    sexo text,
    refMedico text REFERENCES medico(RUT)
);

CREATE TABLE atiende(
    refMedico text REFERENCES medico(RUT),
    refPaciente text REFERENCES paciente(RUT)
);