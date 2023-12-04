#INSERIR DADOS NA TABELA


#insira na nome_tabela
INSERT INTO sala_de_aula(id_sala_aula,
# dentro dos parenteses especificar 
# quais atributos serão atribuidos valores
qt_alunos,
nm_professor,
ds_periodo
)VALUES (
#informo dos dados
1,20, 'jonathan', 'noturno'
);
#

INSERT INTO categoria(id, nm_categoria,ds_categoria)
VALUES (1, 'Eletrônica', 'Dispositivos eletrônicos, como smartphones, laptops e tablets');

INSERT INTO categoria(id, nm_categoria,ds_categoria)
VALUES (2, 'moda', 'Roupas e acessórios de moda para homens e mulheres.');

INSERT INTO categoria(id, nm_categoria,ds_categoria)
VALUES (3, 'livros', 'Diversos gêneros de livros, incluindo ficção, não ficção e literatura clássica.');

INSERT INTO categoria(id, nm_categoria,ds_categoria)
VALUES (4, 'casa e jardim', 'Produtos para decoração, móveis e itens de jardinagem.');

INSERT INTO categoria(id, nm_categoria,ds_categoria)
VALUES (5, 'Esportes e Outdoor', 'Equipamentos esportivos, roupas esportivas e acessórios para atividades ao ar livre.');

#UPDATE
# seleciona a tabela - seleciona a coluna
UPDATE sala_de_aula SET nm_professor = 'henrique'
WHERE id_sala_aula = 1;

UPDATE produto SET 

#update
#Suponha que o preço do "Smartphone XYZ" foi reduzido para 799.99. Atualize o valor na tabela de produtos.
UPDATE produto SET
#INSERT INTO produto (id, nm_produto, qt_estoque, vl_produto, cd_categoria) VALUES
#(6, 'Smartphone XYZ', 50, 5, 6),


# UPDATE
# Suponha que o preço do "Smartphone XYZ" foi reduzido para 799.99. Atualize o valor na tabela de produtos.
UPDATE produto SET vl_produto = 799.99 WHERE nm_produto = 'Smartphone XYZ';

#DELETE
# Remova da tabela de produtos todos os produtos que têm uma quantidade em estoque inferior a 15 unidades.
DELETE FROM produto WHERE qt_estoque < 15;


INSERT INTO endereço (id, municipio, bairro) VALUES
(1,'cidade A', 'centro');

INSERT INTO endereço (id, municipio, bairro) VALUES
(2, 'cidade B', 'Novo Bairro');

INSERT INTO endereço (id, municipio, bairro) VALUES
(3, 'Cidade A', 'Subúrbio');

#CÇIENTES
INSERT INTO cliente (id, nm_cliente,ds_cpf, bl_cooperado, dt_nascimento, cd_endereço ) VALUES
(1, 'João Silva', '12345678901', TRUE, '1985-03-10', 1);

INSERT INTO cliente (id, nm_cliente,ds_cpf, bl_cooperado, dt_nascimento, cd_endereço ) VALUES
(2, 'Maria Oliveira', "98765432101", false, '1992-07-22', 2);

#ID: 3 Nome do Cliente: Carlos Santos CPF: 45678901234 Cooperado: Sim Data de Nascimento: 1978-11-05Endereço: Cidade A, Subúrbio


INSERT INTO cliente(id,nm_cliente,ds_cpf,bl_cooperado, dt_nascimento, cd_endereço ) VALUES
(3, 'Carlos Santos', 45678901234, true, '1978-11-05', 3);

INSERT INTO cliente (id, nm_cliente, ds_cpf, bl_cooperado, dt_nascimento, cd_endereço)
VALUES
(1, 'João Silva', 12345678901, TRUE, '1985-03-10', 1),
(2, 'Maria Oliveira', 98765432101, FALSE, '1992-07-22', 2),
(3, 'Carlos Santos', 45678901234, TRUE, '1978-11-05', 3),
(4, 'Ana Rocha', 87654321098, FALSE, '1989-05-15', 2),
(5, 'Paula Souza', 23456789012, TRUE, '1995-09-30', 1);



#ID: 4
#Nome do Cliente: Ana Rocha
#CPF: 87654321098
#Cooperado: Não
#Data de Nascimento: 1989-05-15
#Endereço: Cidade B, Novo Bairro


INSERT INTO cliente(id,nm_cliente,ds_cpf,bl_cooperado, dt_nascimento, cd_endereço ) VALUES
(4, 'Ana Rocha', 87654321098, FALSE, '1989-05-15', 2);

#ID: 5
#Nome do Cliente: Paula Souza
#CPF: 23456789012
#Cooperado: Sim
#Data de Nascimento: 1995-09-30
#Endereço: Cidade A, Centro

INSERT INTO cliente(id,nm_cliente,ds_cpf,bl_cooperado, dt_nascimento, cd_endereço ) VALUES
(5, 'Paula Souza',  23456789012, true, '1995-09-30', 1 );

SELECT * FROM endereço,

INSERT INTO cliente (id, nm_cliente, ds_cpf, bl_cooperado, dt_nascimento, cd_endereço)
VALUES
(1, 'João Silva', 12345678901, TRUE, '1985-03-10', 1),
(2, 'Maria Oliveira', 98765432101, FALSE, '1992-07-22', 2),
(3, 'Carlos Santos', 45678901234, TRUE, '1978-11-05', 3),
(4, 'Ana Rocha', 87654321098, FALSE, '1989-05-15', 2),
(5, 'Paula Souza', 23456789012, TRUE, '1995-09-30', 1);

INSERT INTO produto (id, nm_produto, qt_estoque, vl_produto, cd_categoria)
VALUES (1, 'Smartphone XYZ', 50, 899.99, 1);

INSERT INTO produto (id, nm_produto, qt_estoque, vl_produto, cd_categoria)
VALUES (2, 'Camiseta Casual', 100, 29.99, 2);

INSERT INTO produto (id, nm_produto, qt_estoque, vl_produto, cd_categoria)
VALUES (3, 'Aventuras Fantásticas', 30, 15.50, 3);

INSERT INTO produto (id, nm_produto, qt_estoque, vl_produto, cd_categoria)
VALUES (4, 'Conjunto de Sofá Moderno', 10, 799.99, 4);

INSERT INTO produto (id, nm_produto, qt_estoque, vl_produto, cd_categoria)
VALUES (5, 'Bicicleta de Montanha', 20, 349.99, 5);
