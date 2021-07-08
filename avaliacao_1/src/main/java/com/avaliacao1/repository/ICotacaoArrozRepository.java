package com.avaliacao1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avaliacao1.domain.CotacaoArroz;
	
	@Repository
	public interface ICotacaoArrozRepository extends JpaRepository<CotacaoArroz, Long>{
	
	
}