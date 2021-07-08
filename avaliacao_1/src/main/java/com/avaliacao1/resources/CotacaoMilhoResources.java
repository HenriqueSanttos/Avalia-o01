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

import com.avaliacao1.domain.CotacaoMilho;
import com.avaliacao1.repository.ICotacaoMilhoRepository;

@RestController
@RequestMapping ("/cotacaom")

public class CotacaoMilhoResources {

	@Autowired 
	private ICotacaoMilhoRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<CotacaoMilho>> listCotacaoMilho() {
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}

	@PostMapping()
	public void salvarCotacaoMilho(@RequestBody CotacaoMilho m ) {
		repository.save(m);
	}
	
}
