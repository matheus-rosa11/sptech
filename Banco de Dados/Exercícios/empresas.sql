create database faculdade;
use faculdade;
create table empresa(
id VARCHAR	(3) PRIMARY KEY,
empresa VARCHAR(20),
responsavel VARCHAR(25)
);
select * from empresa;

INSERT INTO empresa value
('1', 'C6 Bank', 'Caio'),
('2', 'Accenture', 'Rafael'),
('3', 'Safra', 'Caio');

select * from empresa;

insert into empresa value('4', 'Alpe', 'Douglas');
select * from empresa;

update empresa set empresa = 'Alpe' WHERE id = '4';
select * from empresa;

update empresa set responsavel = 'Antônio' where id = '4';
select * from empresa;

insert into empresa value('5', 'ValeMobi', 'Juliana');
select * from empresa order by id;

insert into empresa value('6', 'Stefanini', 'Alvelina');
select id, responsavel, empresa from empresa order by responsavel;

select * from empresa;

