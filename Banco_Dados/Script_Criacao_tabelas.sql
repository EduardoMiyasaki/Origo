CREATE DATABASE preciosos_lacos;

use preciosos_lacos;

CREATE TABLE usuario (
 idUsuario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 nome_completo VARCHAR(100) NOT NULL,
 email VARCHAR(100) NOT NULL UNIQUE,
 senha CHAR(8) NOT NULL,
 cpf VARCHAR(14) NOT NULL UNIQUE,
 telefone VARCHAR(15) NOT NULL,
 data_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP
 );
 
 CREATE TABLE produto ( 
 idProduto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 nome_produto VARCHAR(100) NOT NULL,
 tamanho CHAR(3) NOT NULL UNIQUE,
 preco DOUBLE,
 material VARCHAR(45) NOT NULL UNIQUE,
 cor VARCHAR(45) NOT NULL UNIQUE,
 acabamento VARCHAR(45) NOT NULL,
 descricao VARCHAR(256)
 );
 
 SHOW TABLES;
 
 DESC usuario;
 DESC produto;