create database teste;
use teste;

create table aluno (
	ra int primary key auto_increment,
    nome varchar(45)
) auto_increment = 50000;

desc aluno;
select * from aluno;

create table curso (
	idCurso int primary key auto_increment,
    nome varchar(45)
) auto_increment = 100;

create table matricula (
	idMatricula int auto_increment,
    fkCurso int,
    foreign key (fkCurso) references curso(idCurso),
    fkRA int,
    foreign key (fkRA) references aluno(ra),
    
    primary key (idMatricula, fkRA, fkCurso),
    dtInicio date,
    nivel varchar(2)
);

-- inserindo dados dos alunos

insert into aluno values
	(null, 'Maciel'),
	(null, 'Mayla'),
	(null, 'Elissandra');
    
-- inserindo dados dos cursos

insert into curso values 
	(null, 'Espanhol'),
	(null, 'Mandarim'),
	(null, 'Inglês');
    
-- inserindo matrícula

insert into matricula values 
	(null, 50000, 100, '2022-01-20', 'B1'),
	(null, 50000, 101, '2022-02-20', 'A1'),
	(null, 50001, 100, '2022-01-20', 'B1'),
	(null, 50002, 102, '2022-01-20', 'I3');
    
    select * from aluno;
    
    select * from curso;
    desc curso;
insert into matricula values 
  (null, 100, 50000, '2022-01-20', 'B1'),
  (null, 101, 50000, '2022-02-20', 'A1'),
  (null, 100, 50001, '2022-01-20', 'B1'),
  (null, 102, 50002, '2022-01-20', 'I3');
  
select * from matricula
	join aluno
		on fkRA = aluno.ra
			join curso
				on fkCurso = curso.idCurso;
                
insert into aluno values (null, 'Franklin');

insert into curso values (null, 'Francês');

select * from aluno
	left join matricula
		on matricula.fkRA = aluno.RA
			left join curso
				on matricula.fkCurso = curso.idCurso
					union
						select * from aluno
							right join matricula
								on matricula.fkRA = aluno.RA
									right join curso
										on matricula.fkCurso = curso.idCurso;

-- funções matemáticas

alter table matricula add nota double;

desc matricula;

update matricula set nota = 7.4 where idMatricula = 11;
update matricula set nota = 9.2 where idMatricula = 12;
update matricula set nota = 8.5 where idMatricula = 13;
update matricula set nota = 8 where idMatricula = 14;
select * from matricula;

-- qtd. de registros no campo
select * from matricula;
select count(nivel) from matricula;
select * from matricula;
update matricula set nivel = null where idMatricula = 12;

select sum(nota) from matricula;
select avg(nota) from matricula;
select min(nota), max(nota) from matricula;
select round(avg(nota) + 2, 2) from matricula;

-- truncate

select truncate(avg(nota), 2) from matricula;