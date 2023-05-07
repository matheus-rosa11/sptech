INSERT INTO
    Campeonato(nome, local, data_inicio, data_fim)
VALUES
    ('UEFA Champions League', 'Londres', '2022-08-01', '2023-02-20'),
    ('UEFA Europa League', 'Berlim', '2022-08-01', '2023-02-20'),
    ('Campeonato Paulista', 'Santos', '2022-01-01', '2022-12-24'),
    ('Brasileirão', 'São Paulo', '2023-04-04', '2023-12-12'),
    ('Copa do Brasil', 'Espírito Santo', '2022-01-01', '2022-12-31');

INSERT INTO
    Clube(nome, qtd_titulos, localidade, qtd_torcedores, verba, campeonato_id)
VALUES
    ('Real Madrid', 150, 'Madrid', 13000000, 140000000, 1),
    ('FC Barcelona', 120, 'Barcelona', 13000000, 14000000, 2),
    ('FC Bayern Munchen', 84, 'Bayern', 7000000, 90000000, 2),
    ('Santos', 45, 'Santos', 4, 100000000, 3),
    ('Palmeiras', 20, 'São Paulo', 13000000, 3400000000, 4),
    ('São Paulo', 32, 'São Paulo', 26000000, 156000000, 5),
    ('Vasco da Gama', 1700, 'Rio de Janeiro', 135000000, 15, 4);