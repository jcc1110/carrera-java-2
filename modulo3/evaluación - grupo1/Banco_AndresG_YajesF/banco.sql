-- Creando la base de datos
DROP DATABASE IF EXISTS banco;
CREATE DATABASE banco CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Usando la base de datos
USE banco;

-- Creando las tablas necesarias
DROP TABLE IF EXISTS tipocuenta;
create table tipocuenta (idtipo smallint, descripcion varchar(30)) ENGINE=InnoDB DEFAULT CHARSET=latin1;
DROP TABLE IF EXISTS cuenta;
create table cuentas (idcuenta varchar(20), idtipo smallint, fechacreacion datetime) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS estados;
create table estados (idestado smallint, descripcion varchar(15)) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS clientes;
create table clientes (idcliente int(8) auto_increment, cedula int(8), nombres varchar(30), apellidos varchar(30), telefono varchar(7), correo varchar(50), saldo float(10,2)) ENGINE=InnoDB DEFAULT CHARSET=latin1;
DROP TABLE IF EXISTS usuarios;
create table usuarios (idusuario int(8) auto_increment, usuario varchar(30), clave varchar(30), idcliente int(8)) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS ctasxclientes;
create table ctasxclientes (idcuenta varchar(20), idcliente int(8), idestado smallint) ENGINE=InnoDB DEFAULT CHARSET=latin1;
DROP TABLE IF EXISTS movimientos;
create table movimientos (idmovimiento int(15) auto_increment, idcuentaorig varchar(20), idcuentadest varchar(20), idtipomov char(1), fecha datetime, monto decimal(10,2)) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- EStableciendo la Llave Primaria
ALTER TABLE tipocuenta ADD CONSTRAINT pk_tipocuenta_idtipo PRIMARY KEY (idtipo);
ALTER TABLE cuentas ADD CONSTRAINT pk_cuentas_idcuenta PRIMARY KEY (idcuenta);
ALTER TABLE estados ADD CONSTRAINT pk_estados_idestado PRIMARY KEY (idestado);
ALTER TABLE clientes ADD CONSTRAINT pk_clientes_idcliente PRIMARY KEY (idcliente);
ALTER TABLE usuarios ADD CONSTRAINT pk_usuarios_idusuario PRIMARY KEY (idusuario);
ALTER TABLE ctasxclientes ADD CONSTRAINT pk_ctasxclientes_idcuenta PRIMARY KEY (idcuenta, idcliente);
ALTER TABLE transferencias ADD CONSTRAINT pk_transferencias_idtransferencia PRIMARY KEY (idtransferencia);
ALTER TABLE retiros ADD CONSTRAINT pk_retiros_idretiro PRIMARY KEY (idretiro);
ALTER TABLE depositos ADD CONSTRAINT pk_depositos_iddeposito PRIMARY KEY (iddeposito);

-- Relacionando las tablas
ALTER TABLE cuentas ADD CONSTRAINT fk_cuentas_idtipo FOREIGN KEY (idtipo) REFERENCES tipocuenta(idtipo);-- ON UPDATE CASCADE ON DELETE CASCADE;


--Agregando los Datos
insert into usuarios (usuario, clave) values ('agordillo', '123');
insert into usuarios (usuario, clave) values ('gsalavatierra', '456');




CREATE TABLE usuario (
  id int(11) NOT NULL AUTO_INCREMENT,
  tarjeta varchar(5) DEFAULT NULL,
  clave varchar(5) DEFAULT NULL,
  saldo decimal(10,2) DEFAULT NULL,
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS movimiento;
CREATE TABLE movimiento (
  id_usuario int(11) DEFAULT NULL,
  tipo_movimiento varchar(1) DEFAULT NULL,
  monto decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- Insertando datos de prueba
INSERT INTO usuario (tarjeta, clave, saldo) VALUES ("12345","12345",1200);
INSERT INTO usuario (tarjeta, clave, saldo) VALUES ("54321","12345",2000);
INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (1,"I",200);
INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (1,"E",100);
INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (1,"I",1100);
INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (2,"I",2000);
INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (2,"E",1000);
INSERT INTO movimiento (id_usuario, tipo_movimiento, monto) VALUES (2,"I",1000);

