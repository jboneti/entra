CREATE TABLE sala_de_aula (
id_sala_aula INTEGER,
qt_alunos INTEGER, # colunas = atributos
nm_professor VARCHAR(50),
ds_periodo VARCHAR(20)
);

# a tabela vai ficar rosa caso seja valida(exista)
ALTER TABLE categoria ADD coluna_exemplo INTEGER;
# Não precisa colocar o tipo na hora de deletar
ALTER TABLE categoria DROP coluna_exemplo;

ALTER TABLE sala_de_aula ADD fl_monitor INTEGER;

ALTER TABLE sala_de_aula DROP fl_monitor;

ALTER TABLE pessoa MODIFY nm_pessoa VARCHAR(100);

CREATE TABLE categoria (
id INTEGER PRIMARY KEY,
nm_categoria VARCHAR(50),
ds_categoria VARCHAR(150)
);

CREATE TABLE cliente (
id INTEGER PRIMARY KEY,
nm_cliente VARCHAR(150),
ds_cpf CHAR(11),
bl_cooperado BOOLEAN,
dt_nascimento DATE,
cd_endereço INTEGER,
ds_nascimento VARCHAR(150)
);





CREATE TABLE endereço (
id INTEGER,
municipio VARCHAR(50),
bairro VARCHAR(50)
);




CREATE TABLE produto (
id INTEGER PRIMARY KEY,
nm_produto VARCHAR(50),
qt_estoque INTEGER,
vl_produto DECIMAL,
cd_categoria INTEGER REFERENCES categoria (id)
);

creat
