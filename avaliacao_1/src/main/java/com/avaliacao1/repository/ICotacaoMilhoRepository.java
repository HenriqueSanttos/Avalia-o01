package com.avaliacao1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avaliacao1.domain.CotacaoMilho;

@Repository
public interface ICotacaoMilhoRepository extends JpaRepository<CotacaoMilho, Long>{
	
}
