package com.example.gestaocursosapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestaocursosapi.model.Conta;
import com.example.gestaocursosapi.model.Lancamento;
import com.example.gestaocursosapi.repository.ContaRepository;
import com.example.gestaocursosapi.repository.LancamentoRepository;
import com.example.gestaocursosapi.resource.FiltroLancamento;


@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;

	public List<Lancamento> listarTodos() {
		return (List<Lancamento>) lancamentoRepository.findAll();
	}

	public List<Lancamento> buscarPeloCodigoConta(final Long codigo) {
		//return lancamentoRepository.findAllByContaCodigo(codigo);
		return null;
	}

		@Autowired
		private ContaRepository contaRepository;

		public List<Lancamento> buscarPorConta(final Long codigo) {

			Conta conta = contaRepository.findOne(codigo);

			return lancamentoRepository.findByConta(conta);
		}

		public List<Lancamento> findByContaAndDataBetweenAndValor(FiltroLancamento filtroLancamento){

			return lancamentoRepository.findByContaCodigoAndDataBetweenAndValor(filtroLancamento.getConta(), 
					filtroLancamento.getDataInicial(),filtroLancamento.getDataFinal(),filtroLancamento.getValor());
		}


	}
