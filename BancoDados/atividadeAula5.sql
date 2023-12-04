#1) Calcule a média de idade dos clientes.,
#ELECT COUNT(cd_endereco), cd_endereco FROM cliente GROUP BY (cd_endereco);

#SELECT COUNT(cd_categoria) FROM produto WHERE vl_produto = 1;

#SELECT COUNT(bl_cooperado) FROM cliente WHERE bl_cooperado = TRUE;

SELECT AVG(dt_nascimento) FROM cliente;

SELECT AVG(YEAR(CURRENT_DATE) - YEAR( dt_nascimento)) FROM cliente;

---------------------------------------------------------------------------------------------


#2) Determine a quantidade total de produtos em estoque.
SELECT SUM(qt_estoque) FROM produto;

---------------------------------------------------------------------------------------------


#3) Encontre o valor máximo dos produtos.
SELECT MAX(vl_produto) FROM produto;

---------------------------------------------------------------------------------------------


#4) Calcule a soma total dos valores dos produtos na categoria "Eletrônicos".
SELECT SUM(vl_produto) FROM produto WHERE cd_categoria = 1;

---------------------------------------------------------------------------------------------

#5) Encontre o produto mais barato.
SELECT MIN(vl_produto) FROM produto;
SELECT nm_produto FROM produto WHERE vl_produto = (SELECT MIN(vl_produto) FROM produto);

---------------------------------------------------------------------------------------------

#6) Determine a quantidade total de clientes por município.

SELECT e.nm_municipio, COUNT(c.id) FROM cliente AS c JOIN endereco AS e ON c.cd_endereco = e.id GROUP BY(e.nm_municipio);

----------------------------------------------------------------------------------------------

#7) Calcule a média de estoque por categoria.
SELECT c. nm_categoria, AVG(qt_estoque) FROM produto AS p JOIN categoria AS c ON p.cd_categoria = c.id GROUP BY(c.id);

----------------------------------------------------------------------------------------------

#9) Determine a quantidade de produtos por categoria.
SELECT c. nm_categoria, SUM(qt_estoque) FROM produto AS p JOIN categoria AS c ON p.cd_categoria = c.id GROUP BY(c.id);
----------------------------------------------------------------------------------------------

