create database pet;
use pet;

-- Prof, usei as tabelas compostas pra fazer Telefone e Endereço, não sei se podia mas arrisquei, hihi :D

create table Cliente (
    idCliente int primary key auto_increment,
    nome varchar(45),
    sobrenome varchar(45)
);

insert into Cliente(nome, sobrenome) values
    ('Fernanda', 'Santos'),
    ('Evirênio', 'Silva'),
    ('Gabrielly', 'Assis'),
    ('Joilton', 'Silva');


-- Foi utilizada a regra de telefone: (11) 3944-1445 (14 caracteres (15 para celular))
create table contato (
    idContato int primary key auto_increment,
    telFixo char(14),
    telCel char(15),
    fkCliente int,
    foreign key(fkCliente) references Cliente(idCliente)
);

insert into contato(telFixo, telCel, fkCliente) values
    ('(11) 3944-1445', '(11) 95439-8910', 1),
    ('(11) 3945-1787', '(11) 98769-6440', 2),
    ('(11) 4359-9397', '(11) 97682-8072', 3),
    ('(11) 3946-5593', '(11) 95858-8612', 4);

create table endereco (
    idEndereco int primary key auto_increment,
    estado char(2),
    cidade varchar(45),
    bairro varchar(45),
    rua varchar(45),
    numero int,
    complemento varchar(20),
    fkCliente int,
    foreign key (fkCliente) references Cliente (idCliente)
);

insert into endereco(estado, cidade, bairro, rua, numero, complemento fkCliente) values
    ('SP', 'São Paulo', 'Paulista', 'Haddock Lobo', 595, 'b', 1),
    ('SP', 'São Paulo', 'Parque Taipas', 'José Lopes', 5, 'A', 2),
    ('MG', 'Medina', 'Fim do mundo', 'Magalhães Pinto', 666, 'C', 3),
    ('RS', 'Viamão', 'Jardim Krahe', 'Coliseu', 13, 'B', 4);

create table pet (
    idPet int primary key auto_increment,
    tipo varchar(45)
    -- terão 4 tipos de pets atendidos: gato, cachorro, pássaro e réptil
    constraint chkTipo check (tipo = 'gato' or tipo = 'cachorro' or tipo = 'pássaro' or tipo = 'réptil')
    nomePet varchar(45),
    raca varchar(45),
    dtNasc varchar(45),
    fkCliente int,
    foreign key (fkCliente) references Cliente (idCliente)
) auto_increment = 101;

insert into pet (tipo, nomePet, raca, dtNasc, fkCliente) values
    ('Gato', 'Loki', 'vira-lata', '2018-02-11', 3);
    ('Gato', 'Loki', 'vira-lata', '2018-02-11', 3);
