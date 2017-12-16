package com.example.gestaocursosapi.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestaocursosapi.model.Lancamento;
import com.example.gestaocursosapi.service.LancamentoService;

@RestController 
@RequestMapping("/lancamento")
public class LancamentoResource {

	@Autowired
	LancamentoService lancamentoService;

	@GetMapping("/{codigo}")
	public ResponseEntity<List<Lancamento>> buscarPeloCodigoConta(final @PathVariable Long codigo){
		List<Lancamento> lancamentos = lancamentoService.buscarPorConta(codigo);
		return lancamentos  != null? ResponseEntity.ok(lancamentos ) : ResponseEntity.notFound().build();
	}


	@GetMapping
	public ResponseEntity<List<Lancamento>> listar(){
		List<Lancamento> lancamentos =  lancamentoService.listarTodos();
		return lancamentos  != null? ResponseEntity.ok(lancamentos ) : ResponseEntity.notFound().build();
	}


	@PostMapping("/filtro")
	public ResponseEntity<List<Lancamento>> listarPorFiltro(final @RequestBody FiltroLancamento filtro, final HttpServletResponse response){
		//List<Lancamento> lancamentos = lancamentoService.findByContaCodigoOrValor(filtro);
		List<Lancamento> lancamentos = lancamentoService.findByContaCodigoOrDataBetweenOrValor(filtro);
		return !lancamentos.isEmpty() ? ResponseEntity.ok(lancamentos) : ResponseEntity.noContent().build();
	}


}

