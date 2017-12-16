CREATE TABLE lancamento (
	codigo BIGSERIAL PRIMARY KEY,
	data timestamp,
	conta_codigo bigint NOT NULL REFERENCES conta (codigo),
	operacao varchar(50),
	valor numeric(10,5)
);

INSERT INTO lancamento(conta_codigo, operacao, valor) VALUES (1, 'credito', 405.00);
