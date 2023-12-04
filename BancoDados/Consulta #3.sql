SELECT * FROM categoria;

SELECT nm_categoria, ds_categoria FROM categoria;

SELECT * FROM produto;

SELECT id FROM categoria;

SELECT nm_cliente, ds_nascimento FROM cliente;

SELECT * FROM cliente  
WHERE nm_cliente = 'João' 
OR nm_cliente = 'Carlos Santos';

# qual o campo vai usar para organizar
SELECT * FROM categoria ORDER BY nm_categoria;

# DESC -> em ordem descrecente
# ASC OU OMITIDO -> em ordem crescente
SELECT * FROM categoria ORDER BY nm_categoria DESC;

SELECT * FROM categoria ORDER BY id DESC;

SELECT * FROM cliente ORDER BY nm_cliente;
SELECT * FROM cliente ORDER BY nm_cliente DESC;

SELECT * FROM produto ORDER BY vl_produto;
SELECT * FROM produto ORDER BY vl_produto DESC;