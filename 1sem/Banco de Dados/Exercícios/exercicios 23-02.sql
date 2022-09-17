-- NOTES: diferente em MySQL = <>
---------------- 01 ---------------- 
create database sprint1;
use sprint1;
create table Atleta (
id int primary key auto_increment,
nome varchar(40),
modalidade varchar(40),
qtdMedalha int
);

-- Especificar os campos alterados / adicionados
insert into Atleta (nome, modalidade, qtdMedalha) values
('Antonio', 'Ciclista', 9),
('Claudete', 'Triatleta', 12),
('Evirênio', 'Jogador de Vôlei', 42),
('Samanta', 'Ciclista', 22),
('Juracir', 'Triatleta', 927),
('Daniela', 'Ciclista', 3);
-- Atualizando porque fiz cagada >>
update Atleta set modalidade = 'Ciclismo' where id in (1, 4, 6);
update Atleta set modalidade = 'Natação' where id = 3;
update Atleta set modalidade = 'Triatlo' where id in (2, 5);
select * from Atleta;

-- EXIBIR TODOS OS DADOS DA TABELA
select * from Atleta;

-- ATUALIZAR QUANTIDADE DE MEDALHAS DO ATLETA COM ID = 1
update Atleta set qtdMedalha = 10 where id = 1;
select * from Atleta;

-- ATUALIZAR COM ID = 2 E ID = 3
update Atleta set qtdMedalha = 15 where id in (2, 3);
select * from Atleta;

-- ATUALIZAR O NOME DO ATLETA COM O ID = 4
update Atleta set nome = 'Joabi' where id = 4;
select * from Atleta;

-- ADICIONAR O CAMPO dtNasc NA TABELA, COM A DATA DE NASCIMENTO DOS ATLETAS (date)
alter table Atleta add column dtNasc date;

-- ATUALIZAR A DATA DE NASCIMENTO DOS ATLETAS
update Atleta set dtNasc = '1988-02-11' where id in (1, 4);
update Atleta set dtNasc = '1992-07-02' where id in (2, 5);
update Atleta set dtNasc = '2003-12-15' where id = 3;
desc Atleta;
select * from Atleta;

-- DELETE O ATLETA COM ID = 5
delete from Atleta where id = 5;
select * from Atleta;
-- Não tenho certeza se o ID devia pular de 4 para 6 na tabela, mas ficou assim

-- EXIBIR OS ATLETAS ONDE A MODALIDADE É DIFERENTE DE NATAÇÃO
select * from Atleta where modalidade <> 'Natação';

-- EXIBIR OS DADOS DOS ATLETAS QUE TEM A QTD. DE MEDALHAS MAIOR OU IGUAL A 3
update Atleta set qtdMedalha = 2 where id = 1;
select * from Atleta where qtdMedalha >= 3;

-- MODIFICAR O CAMPO MODALIDADE DO TAMANHO 40 PARA O TAMANHO 60
 alter table Atleta modify modalidade varchar(60);
 
 -- DESCREVER OS CAMPOS DA TABELA MOSTRANDO A ATUALIZAÇÃO DO CAMPO MODALIDADE;
 desc Atleta;
 
 -- LIMPAR OS DADOS DA TABELA
 truncate Musica;
 
 ---------------- 02 ---------------- 
 
 create table Musica (
 idMusica int primary key auto_increment,
 titulo varchar(40),
 artista varchar(40),
 genero varchar(40)
 );
 
 insert into Musica (titulo, artista, genero) values
 ('Azul da Cor do Mar', 'Tim Maia', 'MPB'),
 ('Shivers', 'Ed Sheeran', 'Pop'),
 ('Woman Like Me', 'Little Mix', 'Pop'),
 ('In The End', 'Linkin Park', 'Rock'),
 ('Amiga da Minha Mulher', 'Seu Jorge', 'MPB'),
 ('Happier Than Ever', 'Billie Eilish', 'Pop'),
 ('Nothing Else Matters', 'Metallica', 'Rock');

-- EXIBIR TODOS OS DADOS DA TABELA
select * from Musica;

-- ADICIONAR O CAMPO CURTIDAS (int)
alter table Musica add column curtidas int;
-- Atualizar o campo curtida de todas as músicas
update Musica set curtidas = 700000 where idMusica in (4, 7, 3);
update Musica set curtidas = 1000000 where idMusica in (2, 6);
update Musica set curtidas = 2000000 where idMusica in (1, 5, 7);
select * from Musica;

-- MODIFICAR O CAMPO ARTISTA DO TAMANHO 40 PARA 80
alter table Musica modify artista varchar(80);

-- ATUALIZAR A QTD. DE CURTIDAS PARA ID = 1
update Musica set curtidas = 5000000 where idMusica = 1;

-- ATUALIZAR CURTIDAS COM ID = 2 E 3
update Musica set curtidas = 3000000 where idMusica in (2, 3);

-- ATUALIZAR NOME DA MÚSICA COM ID = 5
update Musica set titulo = 'Música legal' where idMusica = 5;

-- EXCLUIR A MÚSICA COM ID = 4
delete from Musica where idMusica = 4;

-- EXIBIR MUSICAS COM GENERO <> DE FUNK
-- Preciser dar update porque não tinha funk na lista :D
update Musica set titulo = 'Rabetão' where idMusica = 6;
update Musica set artista = 'MC Lan' where idMusica = 6;
update Musica set genero = 'FUnk' where idMusica = 6;

select * from Musica where genero <> 'Funk';

-- EXIBIR OS DADOS DE MÚSICAS COM CURTIDAS >= 20
update Musica set curtidas = 10 where idMusica = 6;
select * from Musica where curtidas >= 20;

-- DESCREVER OS CAMPOS DA TABELA MOSTRANDO A ATUALIZAÇÃO DO CAMPO ARTISTA
desc Musica;

-- LIMPAR OS DADOS DA TABELA
truncate Musica;

---------------- 03 ---------------- 

create table Filme (
idFilme int primary key auto_increment,
titulo varchar(40),
genero varchar(40),
diretor varchar(40) 
);

insert into Filme (titulo, genero, diretor) values
('O Culpado', 'Suspense', 'Antoine Fuqua'),
('Oxigênio', 'Ficção Científica', 'Alexandre Aja'),
('The Soul', 'Suspense', 'Cheng Wei-Hao'),
('Host', 'Terror', 'Rob Savage'),
('Mad Max', 'Ação', 'George Miller'),
('Moana', 'Animação', 'Ron Clements'),
('Divertida Mente', 'Animação', 'Pete Docter');

-- EXIBIR TODOS OS DADOS DA TABELA
select * from Filme;

-- ADICIONAR O CAMPO PROTAGONISTA DO TIPO VARCHAR(50)
alter table Filme add column Protagonista varchar(50);

-- ATT CAMPO PROTAGONISTA
update Filme set protagonista = 'Joe Baylor' where idFilme = 1;
update Filme set protagonista = 'Elizabeth Hansen' where idFilme = 2;
update Filme set protagonista = 'Wang Shicong' where idFilme = 3;
update Filme set protagonista = 'Mike Beckingham' where idFilme = 4;
update Filme set protagonista = 'Max Rockatansky' where idFilme = 5;
update Filme set protagonista = 'Moana' where idFilme = 6;
update Filme set protagonista = 'Riley' where idFilme = 7;
select * from Filme;

-- MODIFICAR O CAMPO DIRETOR DO TAMANHO 40 PARA 150
alter table Filme modify diretor varchar(150);

-- ATUALIZAR O DIRETOR COM ID = 5
update Filme set diretor = 'Douglinhas Mil Grau' where idFilme = 5;

-- ATT DIRETOR COM ID = 2 E 7
update Filme set diretor = 'Claudia dos Santos' where idFilme in (2, 7);

-- ATT TITULO DO FILME COM ID = 8
update Filme set titulo = 'A Volta dos que não Foram' where idFilme = 6;

-- EXCLUIR FILME COM ID = 3
delete from Filme where idFilme = 3;

-- EXIBIR FILMES COM GENERO <> DE DRAMA
update Filme set genero = 'Drama' where idFilme = 1;
select * from Filme where genero <> 'Drama';

-- EXIBIR DADOS DE FILMES COM GENERO = SUSPENSE
update Filme set genero = 'Suspense' where idFilme = 1;
select * from Filme where genero = 'Suspense';

-- DESCREVA CAMPOS DA TABELA MOSTRANDO A ATUALIZAÇÃO DO CAMPO PROTAGONISTA E DIRETOR
desc Filme;

-- LIMPAR OS DADOS DA TABELA
truncate table Filme;

---------------- 04 ---------------- 

create table Professor (
idProfessor int primary key auto_increment,
nome varchar(50),
especialidade varchar(40),
dtNasc date
);

insert into Professor (nome, especialidade, dtNasc) values
('Vivian Silva', 'Banco de Dados', '2000-02-28'),
('Claudio Frizzarini', 'Algoritmos', '1961-03-04'),
('Rafael Galã', 'Banco de Dados', '1980-09-12'),
('Thiago Gomes', 'Desenvolvimento Socioemocional', '1980-06-15'),
('Dan Josua', 'Desenvolvimento Socioemocional', '1985-05-12'),
('Franklin Bonitinho', 'Banco de Dados', '2000-02-12');

-- EXIBIR TODOS OS DADOS DA TABELA
select * from Professor;

-- ADICIONAR CAMPO FUNCAO DO TIPO VARCHAR(50), ONDE FUNÇÃO SÓ PODE SER MONITOR, ASSISTENTE OU TITULAR
alter table Professor add column funcao varchar(50);

-- ATT FUNCAO DOS PROFS
update Professor set funcao = 'titular' where idProfessor in (1, 2, 6);
update Professor set funcao = 'monitor' where idProfessor in (3, 4, 6);

-- INSERIR UM NOVO PROFESSOR
insert into Professor (nome, especialidade, dtNasc) value
	('José Yoshihiro', 'Algoritmos', '1980-02-14');
    
-- EXCLUIR PROFESSOR ONDE O ID = 5
delete from Professor where idProfessor = 5;

-- EXIBIR APENAS OS NOMES DOS PROFESSORES TITULARES
select * from Professor where funcao = 'titular';

-- EXIBIR APENAS ESPECIALIDADES E DATAS DE NASCIMENTO DOS PROFESSORES MONITORES
select especialidade, dtNasc from Professor where funcao = 'monitor';

-- ATT DATA DE NASCIMENTO DO PROFESSOR ID = 3
update Professor set dtNasc = '1976-09-08' where idProfessor = 3;

-- LIMPAR A TABELA PROFESSOR
truncate table Professor;

---------------- 05 ---------------- 

create table Curso (
idCurso int primary key auto_increment,
nome varchar(50),
sigla char(3),
coordenador varchar(50)
);

insert into Curso (nome, sigla, coordenador) values
('Análise e Desenvolvimento de Sistemas', 'ADS', 'Gerson'),
('Ciências da Computação', 'CCO', 'Marise'),
('Sistemas de Informação', 'SIS', 'Alex');

-- EXIBIR OS DADOS DA TABELA
select * from Curso;

-- EXIBIR APENAS OS COORDENADORES DOS CURSOS
select coordenador from Curso;

-- EXIBIR APENAS OS DADOS DOS CURSOS DE UMA DETERMINADA SIGLA (ADS)
select * from Curso where sigla = 'ADS';

-- EXIBIR OS DADOS DA TABELA ORDENADOS PELO NOME DO CURSO
select * from Curso order by nome;

-- EM ORDEM DECRESCENTE
select * from Curso order by nome desc;

----------------- EXIBIR OS DADOS DA TABELA -----------------

-- DOS CURSOS CUJO NOME COMECE COM UMA DETERMINADA LETRA
select * from Curso where nome like 'a%';	

-- TERMINE COM UMA DETERMINADA LETRA
select * from Curso where nome like '%o';

-- TENHA COMO SEGUNDA LETRA UMA DETERMINADA LETRA
select * from Curso where nome like '_i%';

-- PENÚLTIMA LETRA UMA DETERMINADA LETRA
select * from Curso where nome like '%i_';

-- ELIMINE A TABELA
truncate table Curso;
drop table Curso;

---------------- 06 ---------------- 

create table Revista (
idRevista int primary key auto_increment,
nome varchar(40),
categoria varchar(30)
);

insert into Revista (nome) values
('Veja'),
('Isto é'),
('Época'),
('Claudia');

-- ATUALIZE OS DADOS DE CATEGORIA E EXIBA-OS

select * from Revista;
update Revista set categoria = 'Notícias' where idRevista in (1, 3);
update Revista set categoria = 'Moda' where idRevista in (2, 4);
select * from Revista;

-- INSIRA MAIS 3 REGISTROS COMPLETOS

insert into Revista (nome, categoria) values
('Quatro Rodas', 'Carros'),
('Forbes', 'Notícias'),
('Times', 'Notícias');

select * from Revista;

---------------- 07 ---------------- 