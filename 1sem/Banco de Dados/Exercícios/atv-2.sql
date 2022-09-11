create database sprint1;
use sprint1;
create table Atleta(
idAtleta int primary key,
nome varchar(40),
modalidade varchar(40),
qtdMedalha int
);

-- INSERIR ATLETAS NA TABELA
insert into Atleta value
(1, 'Matheus', 'Ciclismo', 3),
(2, 'Douglinhas', 'Ciclismo', 5),
(3, 'Ana Sérgia', 'Basquete', 4),
(4, 'Samira', 'Futebol', 7),
(5, 'Daniel', 'Basquete', 2);

-- EXIBIR TODOS OS DADOS DA TABELA
select * from Atleta;

-- EXIBIR APENAS NOMES E MEDALHAS
select nome, qtdMedalha from Atleta;

-- EXIBIR APENAS DADOS DE ATLETAS DE UMA DETERMINADA MODALIDADE (Basquete)
select * from Atleta where modalidade = 'Basquete';

-- EXIBIR OS DADOS DA TABELA ORDENADOS PELA MODALIDADE
select * from Atleta order by modalidade;