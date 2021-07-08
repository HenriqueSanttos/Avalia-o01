package com.avaliacao1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao1.domain.CotacaoSoja;
import com.avaliacao1.repository.ICotacaoSojaRepository;

@RestController
@RequestMapping ("/cotacaos")
public class CotacaoSojaResources {
	@Autowired 
	private ICotacaoSojaRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<CotacaoSoja>> listCotacaoSoja() {
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}

	@PostMapping()
	public void salvarCotacaoSoja(@RequestBody CotacaoSoja m ) {
		repository.save(m);
	}
	

}
