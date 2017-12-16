package com.example.gestaocursosapi.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.gestaocursosapi.model.Conta;
import com.example.gestaocursosapi.model.Lancamento;


public interface LancamentoRepository extends CrudRepository<Lancamento, Long>{

	//@Query(value = "select distinict l from Lancamento l where l.conta = :conta AND b.author=:author AND b.price=:price")
	//	List<Lancamento> listarPorContaPeriodoValor(@Param("conta") Conta conta, @Param("dataInicial") Date dataInicial,
	//			@Param("dataFinal") Date dataFinal,
	//			@Param("valor") Double valor);
	//
	//	}

	@NullMeans(NullBehavior.IGNORED)
	public List<Lancamento> findByContaCodigoAndDataBetweenAndValor(Long codigo, Date dataInicial,Date dataFinal,Double valor);


	public List<Lancamento> findByConta(Conta conta);

}

