package com.example.gestaocursosapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestaocursosapi.model.Conta;
import com.example.gestaocursosapi.model.Lancamento;
import com.example.gestaocursosapi.repository.ContaRepository;
import com.example.gestaocursosapi.repository.LancamentoRepository;


@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Autowired
	private ContaRepository contaRepository;
	
	public List<Lancamento> buscarPorConta(final Long codigo) {
		
		Conta conta = contaRepository.findOne(codigo);
		
 		return lancamentoRepository.findByConta(conta);
	}

}
