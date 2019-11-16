create database bitacoraLocal;

	use bitacoraLocal;

create table bug(
	id_bug int not null auto_increment,
	bug varchar(3000) not null,
	modulo varchar(100) not null,
	fecha_hora timestamp not null default now(),
	constraint PKBug primary key (id_bug)
);

create table usuario(
	id_usuario int not null auto_increment,
	usuario varchar(30) not null,
	contrasena varchar(30) not null,
	constraint PKUsuario primary key (id_usuario)
);

insert into usuario(usuario, contrasena) values("luisbadillo", "badi");
insert into usuario(usuario, contrasena) values("davidlopez", "david");
insert into usuario(usuario, contrasena) values("jairoconde", "jairo");
insert into usuario(usuario, contrasena) values("franciscajimenez", "francisca");

create table equipo(
	id_equipo int not null auto_increment,
	equipo varchar(10) not null,
	constraint PKEquipo primary key (id_equipo)
);

insert into equipo(equipo) values("L1PC1");
insert into equipo(equipo) values("L1PC2");
insert into equipo(equipo) values("L1PC3");
insert into equipo(equipo) values("L3PC1");
insert into equipo(equipo) values("L3PC2");
insert into equipo(equipo) values("L3PC3");
insert into equipo(equipo) values("LOPC1");
insert into equipo(equipo) values("LOPC2");
insert into equipo(equipo) values("LOPC3");
insert into equipo(equipo) values("LAIPC1");
insert into equipo(equipo) values("LAIPC2");
insert into equipo(equipo) values("LAIPC3");

create table grupo(
	id_grupo smallint not null auto_increment,
	grupo char(2) not null,
	constraint PKGrupo primary key (id_grupo)
);

insert into grupo(grupo) values("3C");
insert into grupo(grupo) values("3F");
insert into grupo(grupo) values("5C");
insert into grupo(grupo) values("5F");

create table docente(
	id_docente int not null auto_increment,
	docente varchar(100) not null,
	constraint PKDocente primary key (id_docente)
);

insert into docente(docente) values("LUIS JESUS PEREZ BADILLO");
insert into docente(docente) values("DAVID FERNANDO LOPEZ LOPEZ");
insert into docente(docente) values("JAIRO CONDE COCOLETZI");
insert into docente(docente) values("FRANCISCA JIMENEZ MATA");

create table alumno(
	id_alumno int not null auto_increment,
	id_grupo smallint not null,
	no_control char(14) not null,
	alumno varchar(200) not null,
	constraint PKALumno primary key (id_alumno),
	constraint FKGrupo foreign key (id_grupo) references grupo(id_grupo)
);

insert into alumno(id_grupo, alumno, no_control) values(1, "JOSE DOMINGO HERNANDEZ RAMOS", "1234567890");

create table bitacora(
	id_bitacora int not null auto_increment,
	id_alumno int not null,
	id_docente int not null,
	id_equipo int not null,
	laboratorio varchar(30) not null,
	fecha_hora_inicio timestamp not null default now(),
	fecha_hora_fin timestamp not null default now(),
	observacion varchar(1000) not null,
	constraint PKBitacora primary key (id_bitacora),
	constraint FKAlumno foreign key (id_alumno) references alumno(id_alumno),
	constraint FKDocente foreign key (id_docente) references docente(id_docente),
	constraint FKEquipo foreign key (id_equipo) references equipo(id_equipo)
);
