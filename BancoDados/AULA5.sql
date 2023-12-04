SELECT AVG (qt_alunos), SUM(qt_alunos) 
FROM sala_de_aula;


SELECT AVG (vl_produto) FROM produto;

SELECT SUM(vl_produto) FROM produto;

SELECT MAX(vl_produto) FROM produto;

SELECT MIN(vl_produto) FROM produto;


SELECT MAX(dt_nascimento) FROM cliente;

SELECT MIN(dt_nascimento) FROM cliente;

SELECT COUNT(*) FROM produto;

SELECT COUNT(cd_endereço), cd_endereço FROM cliente GROUP BY (cd_endereço);

SELECT COUNT(cd_categoria) FROM produto WHERE vl_produto = 1;

SELECT COUNT(bl_cooperado) FROM cliente WHERE bl_cooperado = TRUE;