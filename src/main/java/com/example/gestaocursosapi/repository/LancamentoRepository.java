package com.example.gestaocursosapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestaocursosapi.model.Conta;
import com.example.gestaocursosapi.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

	List<Lancamento> findByConta(Conta conta);
}
