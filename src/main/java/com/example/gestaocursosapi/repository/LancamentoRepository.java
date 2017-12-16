package com.example.gestaocursosapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.gestaocursosapi.model.Aluno;
import com.example.gestaocursosapi.model.Lancamento;

public interface LancamentoRepository extends CrudRepository<Lancamento, Long>{

	Lancamento findAllByCodigoConta();

}
