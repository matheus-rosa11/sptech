create database sprint1;
use sprint1;
create table Professor (
    idProfessor int primary key auto_increment,
    nome varchar(50),
    sobrenome varchar(30),
    especialidade1 varchar(40),
    especialidade2 varchar(40)
);

insert into Professor (nome, sobrenome, especialidade1, especialidade2) values