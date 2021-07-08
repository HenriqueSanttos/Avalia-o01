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

import com.avaliacao1.domain.CotacaoArroz;
import com.avaliacao1.repository.ICotacaoArrozRepository;

@RestController
@RequestMapping ("/cotacaoa")
public class CotacaoArrozResources {

	@Autowired 
	private ICotacaoArrozRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<CotacaoArroz>> listCotacaoArroz() {
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}
	
	@PostMapping()
	public void salvarCotacaoArroz(@RequestBody CotacaoArroz a ) {
		repository.save(a);
	}
	
	
}


