CREATE DATABASE preciosos_lacos;

use preciosos_lacos;

CREATE TABLE tipo_usuario(
	idTipoUsuario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    tipo_usuario VARCHAR(45)
);

CREATE TABLE usuario (
 idUsuario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 nome_completo VARCHAR(100) NOT NULL,
 email VARCHAR(100) NOT NULL UNIQUE,
 senha CHAR(8) NOT NULL,
 cpf VARCHAR(14) NOT NULL UNIQUE,
 telefone VARCHAR(15) NOT NULL,
 data_cadastro DATE
 );
 
CREATE TABLE endereco(
	idEndereco INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    cep VARCHAR(14),
    logradouro VARCHAR(45),
    bairro VARCHAR(45),
    numero INT,
    complemento VARCHAR(45),
    localidade VARCHAR(45),
    uf CHAR(2)
);

CREATE TABLE pedido(
	idPedido INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    data_pedido DATE,
    status_pagamento VARCHAR(45),
    status_pedido VARCHAR(45),
    total DOUBLE,
    forma_pagamento VARCHAR(45)
);


CREATE TABLE modelo(
	idModelo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_modelo VARCHAR(100),
    preco DOUBLE,
    descricao VARCHAR(256),
    foto VARCHAR(256)
);

CREATE TABLE produto(
	idProduto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    tamanho CHAR(3),
    cor VARCHAR(45),
    tipo_laco VARCHAR(45),
    acabamento VARCHAR(45),
    preco_final DOUBLE
);

CREATE TABLE favorito(
	fkUsuario INT NOT NULL,
    fkProduto INT NOT NULL,
    favorito VARCHAR(45),
	CONSTRAINT usuarioFavorito FOREIGN KEY(fkUsuario) REFERENCES usuario(idUsuario),
    CONSTRAINT produtoFavorito FOREIGN KEY(fkProduto) REFERENCES produto(idProduto)
);

CREATE TABLE itens_pedido(
	fkPedido INT NOT NULL,
    fkProduto INT NOT NULL,
    quantidade INT,
    CONSTRAINT pedidoItens FOREIGN KEY(fkPedido) REFERENCES pedido(idPedido),
    CONSTRAINT produtoItens FOREIGN KEY(fkProduto) REFERENCES produto(idProduto)
);


    
