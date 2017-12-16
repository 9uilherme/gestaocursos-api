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
@RequestMapping("/alunos")
public class LancamentoResource {

	@Autowired
	LancamentoService lancamentoService;

	@GetMapping("/{codigo}")
	public ResponseEntity<Lancamento> buscarPeloCodigoConta(final @PathVariable Long codigo){
		//Lancamento lancamento = lancamentoService.buscarPeloCodigoConta(codigo);
		Lancamento lancamento = null;
		return lancamento  != null? ResponseEntity.ok(lancamento ) : ResponseEntity.notFound().build();
	}


	@PostMapping
	public ResponseEntity<List<Lancamento>> listarPorFiltro(final @Valid @RequestBody FiltroLancamento filtro, final HttpServletResponse response){
		//List<Lancamento> lancamentos = lancamentoService.findByContaAndDataBetweenAndValor(filtro);
		List<Lancamento> lancamentos = lancamentoService.listarTodos();
		return !lancamentos.isEmpty() ? ResponseEntity.ok(lancamentos) : ResponseEntity.noContent().build();
	}


}

