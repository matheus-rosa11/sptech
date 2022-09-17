----------- 1 -----------
create database Sprint2;
use Sprint2;

create table Atleta (
idAtleta int primary key auto_increment,
nome varchar(40),
modalidade varchar(40),
qtdMedalha int
);

insert into Atleta (nome, modalidade, qtdMedalha) values
	('Dario', 'Natação', 5),
	('Felipe', 'Triatlo', 2),
	('Joana', 'Ciclismo', 9),
	('Sandro', 'Futebol', 3),
	('Anderson', 'Natação', 2);
    
create table Pais (
idPais int primary key auto_increment,
nome varchar(30),
capital varchar(40)
);

insert into Pais (nome, capital) values
	('Alemanha', 'Berlim'),
	('Brasil', 'Brasília'),
	('Portugal', 'Lisboa'),
	('França', 'Paris');

-- CRIAR CHAVE ESTRANGEIRA NA TABELA CORRESPONDENTE

alter table Atleta add column fkPais int;
alter table Atleta add foreign key (fkPais) references Pais (idPais);

select * from Atleta;
select * from Pais;

-- ATUALIZAR O PAÍS DE TODOS OS ATLETAS

update Atleta set fkPais = 1 where idAtleta in (1, 4);
update Atleta set fkPais = 2 where idAtleta = 5;
update Atleta set fkPais = 3 where idAtleta = 2;
update Atleta set fkPais = 4 where idAtleta = 3;

-- EXIBIR OS ATLETAS E SEU RESPECTIVO PAÍS
select Atleta.idAtleta, Atleta.nome, Pais.nome from Atleta join Pais on Pais.idPais = Atleta.fkPais order by Atleta.idAtleta;

-- EXIBIR APENAS O NOME DO ATLETA E O NOME DO RESPECTIVO PAÍS
select Atleta.nome, Pais.nome from Atleta join Pais on Pais.idPais = Atleta.fkPais where Pais.nome = 'Brasil';

-- EXIBIR OS DADOS DOS ATLETAS, SEUS RESPECTIVOS PAÍSES, DE UMA DETERMINADA CAPITAL
select Atleta.*, Pais.nome, Pais.capital from Atleta join Pais on Pais.idPais = Atleta.fkPais where Pais.capital = 'Berlim';

select
    concat(a.nome, ' - ', a.modalidade) as Atleta,
    concat(p.nome, ' - ', p.capital) as origem
        from atleta as a
            join pais as p 
                on atleta.fkpais = pais.idpais;

select
    concat(a.nome, ' - ', a.modalidade) as atleta,
    qtdMedalha+10 as medalhas
        from Atleta as a
            join Pais as p 
                on a.fkpais = p.idpais;

----------- 2 -----------

create table Musica (
idMusica int primary key auto_increment,
titulo varchar(40),
artista varchar(40),
genero varchar(40)
);

insert into Musica (titulo, artista, genero) values
	('Dingga', 'Mamamoo', 'K-pop'),
	('POP/STARS', 'K/DA', 'K-pop'),
	('A QUEDA', 'Gloria Groove', 'Pop'),
	('MORE', 'K/DA', 'K-pop'),
	('Enemy', 'Imagine Dragons', 'Pop');
    
create table Album (
idAlbum int primary key auto_increment,
nome varchar(40),
tipo varchar(40),
constraint chkTipo check (tipo = 'digital' or tipo = 'físico'),
dtLancamento date
);

insert into Album (nome, tipo, dtLancamento) values
	('K/DA ALBUM', 'Físico', '2019-03-02'),
	('ARCANE', 'Digital', '2021-11-06'),
	('LADY LESTE', 'Digital', '2022-02-10');
    
-- EXIBIR TODOS OS DADOS DAS TABELAS SEPARADAMENTE
select * from Musica;
select * from Album;

-- CRIAR CHAVE ESTRANGEIRA NA TABELA DE ACORDO COM A REGRA DE NEGÓCIO
alter table Musica add column fkAlbum int;
alter table Musica add foreign key (fkAlbum) references Album(idAlbum);

-- ATUALIZAR OS ALBUNS DE CADA MÚSICA
update Musica set fkAlbum = 1 where idMusica in (2, 4);
update Musica set fkAlbum = 2 where idMusica in (1, 5);
update Musica set fkAlbum = 3 where idMusica = 3;
select * from Musica;

-- EXIBIR AS MÚSICAS E SEUS RESPECTIVOS ALBUNS
select Musica.*, Album.nome from Musica join Album on Album.idAlbum = Musica.fkAlbum;

-- EXIBIR SOMENTE TITULO DA MSC E NOME DO RESPECTIVO ALBUM
select Musica.titulo, Album.nome from Musica join Album on Album.idAlbum = Musica.fkAlbum where Album.nome = 'K/DA ALBUM';

-- EXIBIR DADOS DAS MÚSICAS E SEU RESPECTIVO ÁLBUM, DE UM DETERMINADO TIPO
select Musica.*, Album.nome, Album.tipo from Musica join Album on Album.idAlbum = Musica.fkAlbum where Album.tipo = 'Digital';