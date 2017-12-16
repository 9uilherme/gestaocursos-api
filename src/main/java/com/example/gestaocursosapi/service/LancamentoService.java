package com.example.gestaocursosapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.gestaocursosapi.model.Lancamento;
import com.example.gestaocursosapi.repository.LancamentoRepository;


@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public List<Lancamento> buscarPeloCodigoConta(final Long codigo) {
 		//return lancamentoRepository.findAllByCodigoConta(codigo);
		return null;
	}

}
