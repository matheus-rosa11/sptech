create database treinador;
use treinador

create table treinador(
    idTreinador int primary key auto_increment,
    nomeTreinador varchar(45),
    tel varchar(14),
    email varchar(60)
) auto_increment = 10;

insert into treinador(nomeTreinador, tel, email, fknadador) values
    ('Pedro', '98167-1271', 'pedr0sem_h@gmail.com.br'),
    ('Giulia', '98162-1221', 'gigi_8@gmail.com.br'),
    ('Bruno', '95121-8767', 'brun1nh@gmail.com.br'),
    ('Antoniansas', '99912-1168', 'antoni45@gmail.com.br'),
    ('Levi', '95141-3121', 'ackermann_@gmail.com.br');

create table nadador(
    idNadador int primary key auto_increment,
    nome varchar(45),
    estado char(2),
    dtNasc date,
    fkTreinador int,
    foreign key (fkTreinador) references treinador(idTreinador)
) auto_increment = 100;

insert into nadador(nome, estado, dtNasc) values
    ('Anderson', 'RJ', '1991-06-11'),
    ('Douglas', 'RO', '1997-11-06'),
    ('Daniela', 'PA', '1995-05-08'),
    ('Jonas', 'AC', '1999-12-31');

create table novato(
    idNovato int auto_increment,
    fkTreinador int,
    primary key (idNovato, fkTreinador),
    nome varchar(45),
    tel varchar(14),
    email varchar(60),
    foreign key (fkTreinador) references treinador(idTreinador)
);

insert into novato(nome, tel, email, fkTreinador) values
('Deivid', '97612-1212', 'dei_vid@gmail.com', 10),
('Evirênio', '97162-4969', 'evivi62@gmail.com', 10),
('Zelda', '97162-6156', 'save_me@gmail.com', 11),
('Lulu', '97162-4321', 'pixie_btfly@gmail.com', 12),
('Sullivan', '97162-8872', 'lontrasmagicas@gmail.com', 13),
('Ederson', '97162-9194', 'ederson_saints@gmail.com', 14);

-- Exibir todos os dados de cada tabela separadamente
select * from treinador;
select * from nadador;
select * from novato;

-- Exibir dados dos treinadores e os dados de seus respectivos nadadores
select * 
    from treinador
        join nadador
            on nadador.fktreinador = treinador.idtreinador;

-- Exibir dados de x treinador (informar nome) e os dados de seus respectivos nadadores
select * 
    from treinador 
        join nadados 
            on idnadador = fknadador 
                where nomeTreinador = 'Antoniansas';

-- Exibir dados dos treinadores e dados dos seus repectivos treinadores orientadores (somente de x treinador orientador | informar nome)

select * 
    from novato
        join treinador 
            on idtreinador = fkTreinador 
                where nomeTreinador = 'Levi';

-- Exibir dados dos treinadores, dos respectivos nadadores e respectivos treinadores orientadores
select * 
    from treinador 
        join nadados 
            on idnadador = fknadador 
                join novato 
                    on idtreinador = fkTreinador;

-- Exibir dados de um treinador (informar nome), dados dos respectivos nadadores e dados do seu treinador orientador

select * 
    from novato 
        join treinador 
            on idtreinador = fktreinador 
                join nadador 
                    on idnadador = fknadador 
                        where novato.nome = 'Zelda';