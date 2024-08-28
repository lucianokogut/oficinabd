CREATE DATABASE IF NOT EXISTS oficinabd;
USE oficinabd;

CREATE TABLE pessoa (
    idPessoa INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf CHAR(11) NOT NULL UNIQUE,
    idade INT NOT NULL,
    descricao VARCHAR(100) NULL
);

INSERT INTO pessoa (nome, cpf, idade, descricao) VALUES 
('Odete Roitman', '11122233344', 65, 'Vilã na novela Vale Tudo (1988)'),
('Carminha Matoso', '22233344455', 40, 'Vilã na novela Avenida Brasil (2012)'),
('Flora Pereira', '33344455566', 38, 'Vilã na novela A Favorita (2008)'),
('Nazaré Tedesco', '44455566677', 55, 'Vilã na novela Senhora do Destino (2004)'),
('Bia Falcão', '55566677788', 75, 'Vilã na novela Belíssima (2005)');
