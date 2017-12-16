package com.example.gestaocursosapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
}
