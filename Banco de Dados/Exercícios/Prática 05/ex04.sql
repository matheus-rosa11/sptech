create database treinador;
use treinador;

create table treinador (
    idTreinador int primary key auto_increment,
    nome varchar(45),
    telefone varchar(14),
    email varchar(45),
    fkTreinador int,
    foreign key (fkTreinador) references treinador(idTreinador)
) auto_increment = 10;

insert into treinador values 
    (null, 'Rafael', '(11) 987654321', 'rafael.oliveira@sptech', null);

-- INSERNDO UM TREINADOR NOVATO
insert into treinador values
    (null, 'Franklin', '(11) 912345678', 'franklin@sptech', 10);

create table nadador (
    idNadador int primary key auto_increment,
    nome varchar(45),
    estado char(2),
    dtNasc date
    fkTreinador int,
    foreign key (fkTreinador) references (idTreinador)
) auto_increment = 100;

alter table nadador add column fkTreinador int,
    add foreign key (fkTreinador) references treinador(idTreinador);

insert into nadador values
    (null, 'Vivan', 'SC', '2001-10-13', 10),
    (null, 'Vitória', 'SP', '2002-12-09', 10);

select * 
    from treinador as novato
        join treinador as experiente
            on novato.fkTreinador = experiente.idTreinador
                join nadador
                    on novato.fkTreinador = nadador.fkTreinador;