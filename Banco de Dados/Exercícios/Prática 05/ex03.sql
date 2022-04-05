create database PraticaFuncionario;
use PraticaFuncionario;

create table Setor(
    idSetor int primary key auto_increment,
    nomeSetor varchar(40),
    andar int
);

insert into Setor(nomeSetor, andar) values
    ('Recursos Humanos', 1),
    ('Indústria', 2),
    ('Qualidade', 3),
    ('Administração', 4);

create table Funcionario(
    idFunc int primary key auto_increment,
    nomeFunc varchar(40),
    tel varchar(14),
    salario decimal(10.2),
    fkSetor,
    foreign key (fkSetor) references Setor(idSetor)
);

insert into Funcionario(nomeFunc, tel, salario, fkSetor) values
    ('Fernanda', '(11)97682-8072', 5000.00, 1),
    ('Rayssa', '(11)95349-0051', 5000.00, 1),
    ('Matheus', '(11)95439-8910', 4100.00, 2),
    ('Henrique', '(11)95858-8612', 4800.00, 3),
    ('Lourdes', '(11)95349-8692', 3800.00, 4);

create table Acompanhante(
    idAcomp int auto_increment,
    fkFunc int,
    primary key(idAcomp, fkFunci),
    nomeAcomp varchar(40),
    relacao varchar(30),
    dtNasc date,
    foreign key (fkFunci) references Funcionario(idFunc)
);

insert into Acompanhante(nomeAcomp, relacao, dtNasc, fkFunc) values
    ('Sheila', 'Mãe', '1980-09-08', 1),
    ('Fernanda', 'Mâe', '1985-09-27', 2),
    ('Terentowicz', 'Amigo', '2004-02-15', 2),
    ('Elza', 'Mãe', '1955-05-03', 3),
    ('Ivanice', 'Amiga', '1967-12-14', 4);

-- Exibir dados dos setores e seus respectivos funcionários
select * from Setor
    join funcionario on idSetor = fkSetor;

-- Exibir os dados de x setor (informar nome do setor) e dos seus respectivos funcionários
select * from setor
    join funcionario
        on fksetor = idsetor;

-- Exibir dado sdos funcionários e seus acompanhantes
select * from funcionario
    join acompanhante
        on idfunc = fkfunc;

-- Exibir dados de apenas um funcionário (informar nome) e os dados de seus acompanhantes
select * from funcionario
    join acompanhante 
        on idfunc = fkfunc 
            where nomeFunc = 'Matheus';

-- Exibir dados dos funcionários dos setores em quie trabalham e seus acompanhantes
select * from funcionario 
    join setor 
        on idsetor = fksetor 
            join acompanhante 
                on idfunc = fkfunc;
