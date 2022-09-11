create database sprint1;

use sprint1;

create table disciplina(
    idDisciplina int primary key auto_increment,
    nomeDisc varchar(40)
);

create table professor(
    idProfessor int primary key auto_increment,
    nome varchar(50),
    sobrenome varchar(30),
    especialidade1 varchar(40),
    especialidade2 varchar(40),
    fkDisciplina int,
    foreign key (fkDisciplina) references disciplina(idDisciplina)
);

insert into professor(nome, sobrenome, especialidade1, especialidade2) values
('Claudio', 'Frizzarini', 'Algoritmos', 'Matemática'),
('Eduardo', 'Verri', 'Arquitetura Computacional', 'Matemática'),
('Thiago', 'Bonacelli', 'Finanças', 'Gestão de Equipes'),
('Alessandro', 'Goulart', 'Empreendedorismo', 'Comunicação'),
('Fernanda', 'Caramico', 'HTML', 'CSS'),
('Vivian', 'Silva', 'Banco de Dados', 'Didática');

insert into disciplina(nomeDisc) values
('Matemática'),
('Algoritmos'),
('Banco de Dados'),
('HTML');

update professor set fkDisciplina = 1 where idProfessor = 1;
update professor set fkDisciplina = 3 where idProfessor = 2;
update professor set fkDisciplina = 4 where idProfessor = 3;
update professor set fkDisciplina = 2 where idProfessor = 4;
update professor set fkDisciplina = 1 where idProfessor = 5;
update professor set fkDisciplina = 2 where idProfessor = 6;

-- Exibir os professores e suas respectivas disciplinas
select p.*, d.nomeDisc 
    from professor as p 
		join disciplina as d 
			on p.fkDisciplina = d.idDisciplina;


-- Exibir apenas o nome da disciplina e o nome do respectivo professor
select d.nomeDisc, p.nome
	from disciplina as d
		join professor as p
			on d.idDisciplina = p.fkDisciplina;

-- Exibir os dados dos professores, suas respectivas disciplinas de x sobrenome
select p.*, d.nomeDisc
    from professor as p
		join disciplina as d
			on d.idDisciplina = p.fkDisciplina
				where sobrenome = 'Silva';

-- Exibir apenas a especialidade1 e o nome da disciplina, de x professor, crescente pela especialidade1;
select p.especialidade1, d.nomeDisc
    from professor as p 
		join disciplina as d 
			on p.fkDisciplina = d.idDisciplina
				order by especialidade1 asc;




