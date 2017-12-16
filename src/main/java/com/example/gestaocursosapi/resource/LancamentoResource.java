package com.example.gestaocursosapi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
}
