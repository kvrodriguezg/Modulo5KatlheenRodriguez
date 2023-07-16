#Sprint Modulo 5.
#Katlheen Rodriguez.
#Utilizamos base de datos otorgada en ejercicios anteriores.
USE prevencion_riesgos;

#Agregamos los campos necesarios para cada tipo de usuarios.

#Tipo Cliente.
ALTER TABLE usuarios
ADD 
(run int,
f_nac varchar(55),
rut int,
nombres varchar(55),
apellidos varchar(55),
telefono int,
afp varchar(55),
sis_salud varchar(55),
direccion varchar(55),
comuna varchar(55),
edad int);

#Tipo Profesional.
ALTER TABLE usuarios
ADD (
	titulo varchar(55),
    f_ingreso varchar(55)
);

#Tipo Adminsitrativo.
ALTER TABLE usuarios
ADD (
	area varchar(55),
    exp_prev varchar(55)
);

#Ingresamos datos por cada tipo de usuario. 
INSERT INTO usuarios(nombre, tipo, run, f_nac, rut, nombres, apellidos, telefono, afp, sis_salud, direccion, comuna, edad)
values 
('empresa_sa', 'Cliente', 888888888, '20-04-1996', 99999999, 'Camila Valentina', 'Garcia Lopez', 987563254, 'Modelo', 'FONASA',
'Santiago','Santiago',27);
INSERT INTO usuarios(nombre, tipo, run, f_nac, titulo, f_ingreso)
values 
('empresa_002', 'Profesional', 777777777, '23-05-1995', 'Prevencionista', '01-02-2023');
INSERT INTO usuarios(nombre, tipo, run, f_nac, area, exp_prev)
values 
('empresa_022', 'Administrativo', 111111111, '28-07-1993', 'RRHH', '5 años');

#Ingresamos datos en capacitaciones.
INSERT INTO capacitaciones(nombre, detalle)
values 
('Prevencion de accidentes', '5:00 pm'),
('Leyes', '3:00 pm'),
('Estructuras', '1:00 pm');