--CREACIÓN DE LA BASE DE DATOS
CREATE DATABASE EMPRESA_INDUSTRIA_MECANICA
GO
USE EMPRESA_INDUSTRIA_MECANICA
GO

--CREACIÓN DE TABLAS
CREATE TABLE OBRERO(
ID_OBRERO CHAR(4) PRIMARY KEY CHECK(ID_OBRERO LIKE'O[0-9][0-9][0-9]'),
NÚMERO CHAR(9) UNIQUE NOT NULL,
NOMBRE VARCHAR(30) NOT NULL,
CALIF_LAB VARCHAR(20) NOT NULL,
CATEG_OCUP VARCHAR(20) NOT NULL
)
GO

CREATE TABLE NORMA(
ID_NORMA CHAR(4) PRIMARY KEY CHECK(ID_NORMA LIKE'N[0-9][0-9][0-9]'),
ID_OBRERO CHAR(4) FOREIGN KEY(ID_OBRERO) REFERENCES OBRERO(ID_OBRERO),
DESRIPCIÓN VARCHAR(MAX) NOT NULL,
TIEMPO_EJEC VARCHAR(20) NOT NULL
)
GO

CREATE TABLE PAIS_PROCEDENCIA(
ID_PAIS CHAR(5) PRIMARY KEY CHECK(ID_PAIS LIKE'PA[0-9][0-9][0-9]'),
PAIS VARCHAR(20) NOT NULL
)

CREATE TABLE MODELO(
ID_MODELO CHAR(5) PRIMARY KEY CHECK(ID_MODELO LIKE'MO[0-9][0-9][0-9]'),
MODELO VARCHAR(50) UNIQUE NOT NULL
)

CREATE TABLE EQUIPO(
ID_EQUIPO CHAR(4) PRIMARY KEY CHECK(ID_EQUIPO LIKE'E[0-9][0-9][0-9]'),
ID_PAIS CHAR(5) FOREIGN KEY(ID_PAIS) REFERENCES PAIS_PROCEDENCIA(ID_PAIS),
ID_MODELO CHAR(5) FOREIGN KEY(ID_MODELO) REFERENCES MODELO(ID_MODELO),
NOMBRE VARCHAR(30) UNIQUE NOT NULL
)
GO

CREATE TABLE MANTENIMIENTO(
ID_MANT CHAR(4) PRIMARY KEY CHECK(ID_MANT LIKE'M[0-9][0-9][0-9]'),
ID_EQUIPO CHAR(4) FOREIGN KEY(ID_EQUIPO) REFERENCES EQUIPO(ID_EQUIPO),
ID_OBRERO CHAR(4) FOREIGN KEY(ID_OBRERO) REFERENCES OBRERO(ID_OBRERO),
ÚLTIMA_FECHA DATE NOT NULL
)
GO

CREATE TABLE OPERACION(
ID_OPE CHAR(5) PRIMARY KEY CHECK(ID_OPE LIKE'OP[0-9][0-9][0-9]'),
ID_NORMA CHAR(4) FOREIGN KEY(ID_NORMA) REFERENCES NORMA(ID_NORMA),
NOMBRE VARCHAR(30) NOT NULL 
)
GO

CREATE TABLE PIEZA(
ID_PIEZA CHAR(4) PRIMARY KEY CHECK(ID_PIEZA LIKE'P[0-9][0-9][0-9]'),
ID_OPE CHAR(5) FOREIGN KEY(ID_OPE) REFERENCES OPERACION(ID_OPE),
ID_EQUIPO CHAR(4) FOREIGN KEY(ID_EQUIPO) REFERENCES EQUIPO(ID_EQUIPO),
DESCRIPCIÓN VARCHAR(MAX) NOT NULL,
PESO_UNIT DECIMAL(6,2) NOT NULL
)
GO

--INSERTAR REGISTROS EN LAS TABLAS
INSERT INTO OBRERO VALUES('O001','995314562','Agustín','Especialista','Directo'),
						 ('O002','986126783','José','Principiante','Auxiliar'),
						 ('O003','911246125','Luciana','Intermedio','Auxiliar'),
						 ('O004','900521315','Stive','Principiante','Directo'),
						 ('O005','908320913','Rosa','Especialista','Directo')
GO

INSERT INTO NORMA VALUES('N001','O001','Norma de seguridad en el manejo de maquinaria','2 horas'),
						('N002','O001','Norma de calidad en la fabricación de piezas','5 mins por pieza'),
						('N003','O005','Norma de mantenimiento preventivo','3 horas'),
						('N004','O001','Norma de eficiencia en el proceso de producción','4 horas'),
						('N005','O004','Norma de capacitación y desarrollo del personal','3 horas y media')
GO

INSERT INTO PAIS_PROCEDENCIA VALUES('PA001','ESPAÑA'),
								   ('PA002','FRANCIA'),
						           ('PA003','PERÚ'),
								   ('PA004','CHINA'),
						           ('PA005','EEUU')

INSERT INTO MODELO VALUES('MO001','Haco PPES'),
						 ('MO002','DoALL C-916SNC'),
						 ('MO003','Lincoln Electric Power MIG 210 MP'),
						 ('MO004','Haas TL-1'),
						 ('MO005','Bridgeport Series I')

INSERT INTO EQUIPO VALUES('E001','PA001','MO004','Torno CNC'),
						 ('E002','PA001','MO005','Fresadora Vertical'),
						 ('E003','PA003','MO003','Máquina de soldadura por arco'),
						 ('E004','PA005','MO001','Prensa hidráulica'),
						 ('E005','PA004','MO002','Sierra de sinta automática')
GO

INSERT INTO MANTENIMIENTO VALUES('M001','E002','O003','2024-05-24'),
								('M002','E004','O002','2924-04-16'),
								('M003','E001','O003','2024-03-05'),
								('M004','E003','O003','2024-03-26'),
								('M005','E005','O002','2024-03-06')
GO

INSERT INTO OPERACION VALUES('OP001','N003','Soldadura'),
							('OP002','N004','Estampado'),
							('OP003','N003','Soldadura'),
							('OP004','N005','Corte con Sierra de Cinta'),
							('OP005','N001','Torneado')
GO

INSERT INTO PIEZA VALUES('P001','OP003','E003','Un bastidor de metal soldado con múltiples uniones para ensamblar componentes mecánicos',100),
						('P002','OP003','E003','Un bastidor de metal soldado con múltiples uniones para ensamblar componentes mecánicos',100),
						('P003','OP002','E004','Una cubierta metálica con formas geométricas y perforaciones precisas para su uso como carcasa de un dispositivo electrónico',150),
						('P004','OP004','E005','Una viga de acero cortada a medida con ángulos precisos para su uso en la construcción de estructuras metálicas',120),
						('P005','OP005','E001','Un eje cilíndrico de acero inoxidable con rosca interna para su uso en maquinaria industrial',30)
GO

--SECCIÓN DE EJECUCIÓN
SELECT ID_PIEZA,ID_OPE,DESCRIPCIÓN, CONCAT('$', CAST(PESO_UNIT AS VARCHAR)) AS PESO_UNIT FROM PIEZA

SELECT * FROM OPERACION

SELECT * FROM EQUIPO

SELECT * FROM NORMA

SELECT * FROM OBRERO

SELECT * FROM MANTENIMIENTO

SELECT * FROM PAIS_PROCEDENCIA

SELECT * FROM MODELO

--ACCEDER AL DIAGRAMA DE BASE DE DATOS
ALTER AUTHORIZATION ON DATABASE::EMPRESA_INDUSTRIA_MECANICA TO sa