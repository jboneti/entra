CREATE TABLE livro(
id INTEGER,
cd_livro INTEGER,
nm_titulo VARCHAR(50),
ano_publicado INTEGER,
vl_livro DECIMAL(8,2),
cd_editora INTEGER
);

CREATE TABLE editora(
id INTEGER PRIMARY KEY,
cd_editora INTEGER,
nm_editora VARCHAR(50)
);

CREATE TABLE autor_livro(
id INTEGER PRIMARY KEY,
cd_livro INTEGER,
cd_autor INTEGER,
papel_no_livro VARCHAR(200),
ano_contribuicao INTEGER
);

CREATE TABLE autor(
id INTEGER PRIMARY KEY,
cd_livro INTEGER,
nm_autor VARCHAR(100),
dt_nascimento DATE
);
