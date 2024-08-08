CREATE TABLE CLIENTE(
    id_cliente number primary key, 
    nome varchar(30),
    dt_nascimento date,
    cpf varchar(15),
    id_endereco number,
    id_tipo_cliente number,
    id_genero number
);

CREATE TABLE TIPO_CLIENTE(
    id_tipo_cliente number primary key,
    desc_tipo char(2)
    id_cliente number,
);

CREATE TABLE GENERO(
    id_gen number primary key,
    desc_genero varchar(20),
    id_cliente number,
    
);

CREATE TABLE ENDERECO(
    id_endereco number primary key,
    tipo_endereco varchar(20),
    logradouro varchar(100),
    complemento varchar(50),
    numero number,
    id_bairro number,
    id_cidade number,
    id_estado number,
    id_pais number
);

CREATE TABLE BAIRRO(
    id_bairro number primary key,
    nome_bairro varchar,
    id_cidade number
);

CREATE TABLE CIDADE(
    id_cidade number primary key,
    nome_cidade varchar,
    id_estado number
);

CREATE TABLE ESTADO(
    id_estado number primary key,
    nome_estado varchar,
    id_pais number
);

CREATE TABLE PAIS(
    id_pais number primary key,
    nome_pais varchar
);

ALTER TABLE CLIENTE ADD CONSTRAINT FK_TIPO
FOREIGN KEY(id_tipo_cliente) REFERENCES TIPO_CLIENTE(id_tipo_cliente);

