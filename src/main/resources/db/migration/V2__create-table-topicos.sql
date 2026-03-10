CREATE TABLE topicos (
   id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
   titulo VARCHAR(255) NOT NULL,
   mensaje TEXT NOT NULL,
   curso VARCHAR(255) NOT NULL,
   usuario_id BIGINT NOT NULL,
   CONSTRAINT fk_topicos_usuario FOREIGN KEY (usuario_id)
       REFERENCES usuarios (id)
       ON DELETE CASCADE
);