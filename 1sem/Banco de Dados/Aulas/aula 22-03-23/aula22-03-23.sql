create database faculdade;
use faculdade;
-- É CRIADA A TABELA SALA PRIMEIRO PORQUE ELA NÃO DEPENDE DO NOTEBOOK
create table Sala (
idSala int primary key auto_increment,
lado varchar(45),
andar varchar(45)
);

insert into Sala (andar, lado) values
	('1', 'A'),
	('1', 'B'),
	('2', 'A'),
	('2', 'B');

create table Notebook (
idNotebook int primary key auto_increment,
faculdade varchar(45),
unidade varchar(45),
patrimonio varchar(45),
so1 varchar(45)
constraint chkSO1 check (so1 = 'Windows' or so1 = 'Linux'),  
so2 varchar(45)
constraint chkSO2 check (so2 = 'Windows' or so2 = 'Linux')
);

insert into Notebook (faculdade, unidade, patrimonio, so1, so2) values
	('SPTECH', 'HDK', '2164', 'Windows', 'Linux'),
	('SPTECH', 'HDK', '2165', 'Linux', 'Windows'),
	('SPTECH', 'HDK', '2166', 'Linux', 'Windows'),
	('SPTECH', 'HDK', '2167', 'Windows', 'Linux');

select * from Sala, Notebook;

alter table Notebook add column fkSala int;
alter table Notebook add foreign key (fkSala) references Sala(idSala);
select * from Sala, Notebook join Notebook on Sala.idSala = Notebook.fkSala;

select andar, lado from sala;
select concat(andar, lado) from sala;
-- ALIASES (APELIDO)
select concat(andar, lado) as 'Nome Sala' from sala;

select * from notebook as note
join sala as sl on sl.idsala = note.fksala;
