CREATE TABLE categoria
(
id_categoria INTEGER,
nm_categoria VARCHAR(50),
ds_categoria VARCHAR(150)
);


CREATE TABLE cliente
(
id_cliente INTEGER,
nm_cliente VARCHAR(150),
ds_cpf CHAR (11),
bl_cooperado BOOLEAN,
dt_nascimento DATE
);

CREATE TABLE voo
(
nr_numero INTEGER,
qnt_passagens INTEGER,
hr_decolagem DATETIME,
hr_prevista DATETIME,
ds_destino VARCHAR(150),
preco_passagem DECIMAL
);