CREATE TABLE "Membro"(
    "id" bigserial NOT NULL,
    "nome" VARCHAR(255) NOT NULL,
    "endereco" VARCHAR(255) NOT NULL,
    "telefone" BIGINT NOT NULL
);
ALTER TABLE
    "Membro" ADD PRIMARY KEY("id");
CREATE TABLE "Livro"(
    "id" bigserial NOT NULL,
    "titulo" VARCHAR(255) NOT NULL,
    "autor" VARCHAR(255) NOT NULL,
    "anoPublicacao" BIGINT NOT NULL
);
ALTER TABLE
    "Livro" ADD PRIMARY KEY("id");
CREATE TABLE "Emprestimo"(
    "id" bigserial NOT NULL,
    "livro_id" bigserial NOT NULL,
    "membro_id" bigserial NOT NULL,
    "data_emprestimo" DATE NOT NULL,
    "data_devolucao" DATE NOT NULL
);
ALTER TABLE
    "Emprestimo" ADD PRIMARY KEY("id");
CREATE TABLE "Bibliotecario"(
    "bibliotecario_id" bigserial NOT NULL,
    "nome" VARCHAR(255) NOT NULL,
    "email" VARCHAR(255) NOT NULL,
    "senha" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "Bibliotecario" ADD PRIMARY KEY("bibliotecario_id");
CREATE TABLE "Visitante"(
    "visitante_id" bigserial NOT NULL,
    "nome" VARCHAR(255) NOT NULL,
    "telefone" BIGINT NOT NULL
);
ALTER TABLE
    "Visitante" ADD PRIMARY KEY("visitante_id");
ALTER TABLE
    "Emprestimo" ADD CONSTRAINT "emprestimo_fk livro_id_foreign" FOREIGN KEY("FK livro_id") REFERENCES "Livro"("id");
ALTER TABLE
    "Emprestimo" ADD CONSTRAINT "emprestimo_fk membro_id_foreign" FOREIGN KEY("FK membro_id") REFERENCES "Membro"("id");