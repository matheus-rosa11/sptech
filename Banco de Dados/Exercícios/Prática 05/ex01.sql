create database Pet;
use Pet;

create table Dono(
    idDono int primary key auto_increment,
    nomeDono varchar(45),
    sobrenome varchar(45)
);

insert into Dono(nomeDono, telFixo, telCel) values
    ('Matheus', '(11)3944-1445', '(11)95439-8910'),
    ('Lucos', '(33)4837-1223', '(33)93458-8123'),
    ('Yura', '(11)3456-3565', '(11)93241-1243'),
    ('Blake', '(22)3485-1111', '(11)95349-0051');

create table Contato(
    idContato int primary key auto_increment,
    telFixo varchar(13),
    telCel varchar(14),
    fkDono int,
    foreign key (fkDono) references Dono(idDono)
);

insert into Contato(telFixo, telCel, fkDono) values
    ('(11)3944-1445', '(11)95439-8910', 1),
    ('(33)4837-1223', '(33)93458-8123', 2),
    ('(11)3456-3565', '(11)93241-1243', 3),
    ('(22)3485-1111', '(11)95349-0051', 4);

create table Logradouro(
    idLogradouro int primary key auto_increment,
    estado char(2),
    cidade varchar(50),
    bairro varchar(45),
    rua varchar(45),
    complemento varchar(45),
    fkDono int,
    foreign key (fkDono) references Dono(idDono)
);

alter table Logradouro add column numero int after rua;

insert into Logradouro(estado, cidade, bairro, rua, numero, complemento, fkDono) values
    ('SP', 'São Paulo', 'Parque Taipas', 'José Lopes', 5, 'A', 1),
    ('MG', 'Cidade Legal', 'Piraporinha do Sul', 'Rua Zica', 4, 'D', 2),
    ('SP', 'Muralha Rose', 'Trost', 'Travessa 3', 87, 'C', 3),
    ('SP', 'Aldeia da Folha', 'Logo Ali', 'Ruazona', 297, 'U', 4);

create table Pet(
    idPet int primary key auto_increment,
    tipo varchar(45),
    nomePet varchar(45),
    raca varchar(45),
    dtNasc date,
    fkDono int,
    foreign key (fkDono) references Dono(idDono)
) auto_increment = 101;

insert into Pet(tipo, nomePet, raca, dtNasc, fkDono) values
    ('Gato', 'Loki', 'Vira-lata', '2018-02-11', 1),
    ('Gato', 'Yuumi', 'Angorá', '2018-03-14', 1),
    ('Hamster', 'Giorno Giovanna', 'Roborovski', '2010-03-02', 2),
    ('Cachorro', 'Douglas', 'Vira-lata', '1994-09-20', 4),
    ('Cachorro', 'Justin Bieber', 'Pastor Alemão', '2013-04-25', 3);


-- Adicionando os sobrenomes, pois não inseri direto no create table :p
alter table Dono add column sobrenome varchar(50) after nomeDono;

-- Atualizando sobrenomes dos donos
update Dono set sobrenome = 'Rosa' where idDono = 1;
update Dono set sobrenome = 'Heiner' where idDono = 2;
update Dono set sobrenome = 'Silva' where idDono in(3, 4);

-- Exibindo todos os dados de cada tabela separadamente
select * from Dono;
select * from Pet;

-- Alterando tamanho da coluna nome do cliente
alter table Dono modify column nomeDono varchar(50);

-- Exibir dados de pets de um determinado tipo (mostrei o nome do dono também, pra ficar fofinho :3)
select p.*, d.nomeDono
    from Pet as p 
        join Dono as d
            on p.fkDono = d.idDono
                where tipo = 'Gato' order by idPet;

-- Exibir apenas os nomes e datas de nascimento dos pets
select nomePet, dtNasc 
    from Pet    
        order by dtNasc;

-- Exibir dados dos pets em ordem crescente pelo nome
select * from Pet order by nomePet asc;

-- Exibir dados dos clientes ordenados decrescentemente pelo bairro
select d.*, l.bairro
    from Dono as d
        join Logradouro as l
            on d.idDono = l.fkDono
                order by bairro;

-- Exibir nomes dos pets que nome comece com X letra
select * from Pet where nomePet like 'G%';

-- Exibir dados dos clientes com mesmo sobrenome
select concat(nomeDono, ' ', sobrenome) as Cliente from Dono where sobrenome = 'Silva';

-- Alterar o telefone de x cliente
update Contato set telFixo = '(34)3946-5593' where fkDono = 4;
select * from Contato where fkDono = 4;
-- sim, alterou

-- Exibir dados dos pets e seus respectivos donos
select p.*, concat(d.nomeDono, ' ', d.sobrenome) as Dono
    from Pet as p
        join Dono as d
            on idDono = fkDono
                order by idPet asc;

-- Exibir dados dos pets + donos de x cliente
select p.*, concat(d.nomeDono, ' ', d.sobrenome) as Dono
    from Pet as p
        join Dono as d
            on d.idDono = p.fkDono
                where d.idDono = 3
                    order by p.idPet;

-- Deletar um pet :( quanta maldade fessora, eu amava meus bichinho
delete from Pet where idPet = 104;
select * from Pet;
-- sim, excluiu :'(

-- Deletar as tabelas
drop table Dono;
drop table Logradouro;
drop table Contato;
drop table Pet;