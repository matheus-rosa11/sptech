/*
Desc também serve para descrever a tabela, dizendo o tipo dos dados e quem é chave primária, etc.
UPDATE & DELETE só podeM ser usadoS com "WHERE ID ="
Chave primária não pode ser nula
DADOS PESSOAS NÃO SE COLOCAM COMO CHAVE PRIMÁRIA PORQUE EXISTEM VÁRIOS IGUAIS
*/

-- ALTER TABLE (Atualiza/Modifica a ESTRUTURA da tabela)

-- "Ah, escrevi o nome do campo errado | Não precisa dropar a tabela, apenas utilize o alter table:

create database faculdade;
use faculdade;
create table Empresa (
id int primary key auto_increment,
nome varchar(100),
responsavel varchar (100)
);

desc Empresa;
-- É UTILIZADO O NULL PARA ADICIONAR OS VALORES AUTOMATICAMENTE
insert into Empresa values (null, 'C6 Bank', 'Paulo');

select * from Empresa;

-- Inserir dados em campos específicos, porque o MySQL vai adicionar o ID sozinho
insert into Empresa (nome, responsavel) values ('Safra', 'Franklin');

select * from Empresa;

-- ALTER TABLE --
-- Supondo que eu coloquei o nome do campo "nome" e quero renomear para "empresa"

alter table Empresa rename column nome to nomeEmpresa;
select * from Empresa;

/* TIPOS DE NÚMERO
INT 10 DÍGITOS
FLOAT 7 DÍGITOS 32 BITS
DOUBLE 15 DÍGITOS 64 BITS
DECIMAL ("casas antes da vírgula", "casas depois da vírgula"), 28 DÍGITOS 128 BITS
EXEMPLO DECIMAL 1234567,89
EXEMPLO DECIMAL (5,3) 12,345
*/

alter table Empresa add column salario decimal(10,2);
-- USE MUITO O DESC
desc Empresa;
select * from Empresa;

-- ATUALIZAR OS SALÁRIOS DOS RESPONSÁVEIS

update Empresa set salario = 2.90 where id = 1 or id = 2;
update Empresa set salario = 5.99 where id in (1,2);
select * from Empresa;

-- COMANDOS DENTRO DO ALTER TABLE
-- DROP COLUMN

alter table Empresa drop column salario;
select * from Empresa;



-- MODIFY COLUMN DENTRO DO ALTER TABLE (!!!!!!!!!!!!!!!!)


alter table Empresa modify column responsavel varchar(75);
desc Empresa;


-- ^^^^^^ ALTERAR, POR EXEMPLO, O VARCHAR DO CAMPO!!!!!!!!!

-- TRUNCATE TABLE - LIMPA OS REGISTROS E CONFIGURAÇÕES DA TABELA INTEIRA
select * from empresa;

delete from empresa where id = 1 or id = 2;

insert into empresa values (null, 'BandTec International', null);
select * from empresa;
-- Neste caso, o ID começa a partir do 3, porque o último registro DELETado foi 2

truncate table empresa;
-- funciona sem table também, mas como ele é DDL (Define estrutura da tabela), todos os outros utilizam table
select * from empresa;


-- PARA EXCLUIR APENAS UMA LINHA
-- delete from empresa where id = x
select * from empresa;

-- DATA
alter table Empresa add column dtInicio date;
-- Existem 4 tipos de data:
-- DATE ('YYYY-MM-DD')
-- DATETIME ('YYYY-MM-DD' HH:MM:SS)
-- TIME ('HH:MM:SS')
select * from Empresa;
update Empresa set dtInicio = '2016-01-01' where id = 1;
