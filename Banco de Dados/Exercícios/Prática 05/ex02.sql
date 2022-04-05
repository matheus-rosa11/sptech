create database Gastos;
use Gastos;

create table Pessoa(
    idPessoa int primary key auto_increment,
    nome varchar(45),
    dtNasc date,
    profissao varchar(40)
);

insert into pessoa(nome, dtNasc, profissao) values
    ('Sabrina', '2004-02-13', 'Pediatria'),
    ('Anderçom', '1999-10-14', 'Desenvolvimento'),
    ('Trigo', '2000-09-11', 'ProPlayer'),
    ('Denver', '1992-03-20', 'Cinema'),
    ('Fernanda', '2003-07-02', 'Psicologia')

create table Gastos(
    idGasto int primary key auto_increment,
    dtGasto date,
    valor decimal(10.2),
    descricao varchar(40),
    fkPessoa int,
    foreign key (fkPessoa) references Pessoa(idPessoa)
);

insert into Gastos(dtGasto, valor, descricao, fkPessoa) values
    ('2021-04-26', 250.00, 'Estetoscópio', 1),
    ('2019-03-03', 5000.00, 'Notebook', 2),
    ('2022-03-04', 117.30, 'Mouse', 3),
    ('2020-02-11', 20.00, 'Garrafa', 4),
    ('2021-07-02', 23.00, 'Livro', 5);
   
-- Exibir dados de cada tabela individualmente
select * from Pessoa;
select * from Gastos;

-- Exibir somente dados de cada tabela, filtrando por algum dado da tabela
select * from Pessoa where profissao = 'Psicologia';

-- Exibir dados das pessoas e seus gastos correspondentes
select * from Pessoa as p
    join Gastos as g
        on idPessoa = fkPessoa;

-- Exibir dados de x pessoa e seus gastos correspondentes
select * from Pessoa as p
    join Gastos as g
        on idPessoa = fkPessoa
            where nome = 'Fernanda';

-- Atualize os dados já inseridos na tabela
update gastos set valor = 100.00 where idGasto = 1;
update gastos set valor = 120.00 where idGasto = 2;
update gastos set valor = 150.00 where idGasto = 3;
update gastos set valor = 200.00 where idGasto = 4;
update gastos set valor = 500.00 where idGasto = 5;

-- Exclua um ou mais registros de alguma tabela
delete from Gastos where idGasto = 3;