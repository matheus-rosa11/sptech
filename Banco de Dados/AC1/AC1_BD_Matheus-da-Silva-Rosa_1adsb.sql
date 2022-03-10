create database faculdade;
use faculdade;
create table Video (
idVideo int primary key auto_increment,
titulo varchar(120),
tamanho double,
dtVideo date,
resolucao varchar(10)
);

-- INSERINDO 5 VÍDEOS
-- Tive que verificar a tabela porque meu PC desligou :(
select * from Video;
insert into Video (titulo, tamanho, dtVideo, resolucao) values
('Colei na prova e olha no que deu', 300.23, '2020-10-08', '1280x720'),
('Como beber água', 78.44, '2013-08-07', '2560x1440'),
('Música legal', 800.35, '1980-09-03', '5120x2160'),
('Aula de Progressão Geométrica', 1260.22, '2015-12-13', '1280x720'),
('Como jogar LOL', 760.23, '2019-11-23', '1920x1080');

-- ADICIONANDO CAMPO 'EDITOR' NA TABELA
alter table Video add column editor varchar(100);
-- ATUALIZANDO CAMPOS
update Video set editor = 'Eduardo' where id = 1;
update Video set editor = 'Karina' where id = 2;
update Video set editor = 'Yuri' where id = 3;
update Video set editor = 'José' where id = 4;
update Video set editor = 'Daniela' where id = 5;

-- EXECUTANDO COMANDOS
	-- A) EXIBIR TODOS OS DADOS
    select * from Video;
    -- B) APENAS TITULOS E TAMANHOS
    select titulo, tamanho from Video;
    -- C) APENAS DADOS DE X EDITOR
    select * from Video where editor = 'Karina';
    -- D) APENAS VIDEOS DE X RESOLUÇÃO
    select * from Video where resolucao = '1280x720';
    -- E) ORDENADOS POR DATA EM ORDEM CRESCENTE
    select * from Video order by dtVideo;
    -- F) ORDENADOR POR TITULO DECRESCENTE
    select * from Video order by titulo desc;
    -- G) VIDEOS CUJO TITULO COMECE COM X LETRA
    select * from Video where titulo like 'C%';
    -- H) TAMANHO TERMINE COM X NÚMERO
    select * from Video where tamanho like '%3';
    -- I) TITULO COM SEGUNDA LETRA X
    select * from Video where titulo like '_o%';
    -- J) RESOLUÇÃO COM PENÚLTIMO NÚMERO, X NÚMERO
    select * from Video where resolucao like '%2_';
    -- K) ATUALIZE O TAMANHO DO VIDEO E EXIBA
    update Video set tamanho = '5120x2160' where idVideo = 1;
    -- L) EXCLUA ALGUM VIDEO E EXIBA
    delete from Video where tamanho like '800%';
    
-- QUESTÃO 5 --
-- DIMINUIR TAMANHO DO TÍTULO
alter table Video modify column titulo varchar(80);
truncate Video;
drop table Video;
drop database faculdade;
