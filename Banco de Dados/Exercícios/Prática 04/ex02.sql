create database sprint2;
use sprint2;

create table curso(
    idCurso int primary key auto_increment,
    nome varchar(50),
    sigla char(3),
    coordenador varchar(50)
);

insert into curso(nome, sigla, coordenador) values
    ('Análise e Desenvolvimento de Sistema', 'ADS', 'Gerson'),
    ('Sistema da Informação', 'SIS', 'Alex'),
    ('Ciências da Computação', 'CCO', 'Marise');

create table professor(
    idProfessor int primary key auto_increment,
    nome varchar(45),
    matéria varchar(45),
    fkCurso int,
    foreign key(fkCurso) references Curso (idCurso)
);

insert into professor(nome, matéria, fkCurso) values
    ('Vivian', 'Banco de dados', 1),
    ('Julia', 'TI', 1),
    ('Thiago', 'Socioemocional', 3),
    ('Marise', 'Arq Comp', 2);

-- Faça um JOIN entre as duas tabelas
select 
    concat(p.nome, ' - ', p.matéria),
    concat(c.nome , ' - ', c.sigla)
    from professor as p
		join curso as c 
			on p.fkCurso = c.idCurso;

-- Faça um JOIN com WHERE entre as duas tabelas
select
    concat(p.nome, ' - ', p.matéria),
    concat(c.nome, ' - ', c.sigla)
    from professor as p 
		join curso as c 
			on p.fkCurso = c.idCurso
				where c.sigla = 'ADS';

-- Crie um campo com a restrição (constraint) de CHECK
alter table professor add column tipo varchar(30);
alter table professor add check (tipo = 'monitor' or tipo = 'professor' or tipo = 'assistente');

update professor set tipo = 'professor' where idProfessor = 1;
update professor set tipo = 'assistente' where idProfessor = 2;
update professor set tipo = 'monitor' where idProfessor = 3;
update professor set tipo = 'professor' where idProfessor = 4;
