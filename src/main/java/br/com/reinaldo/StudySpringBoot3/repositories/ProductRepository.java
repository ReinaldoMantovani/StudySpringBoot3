package br.com.reinaldo.StudySpringBoot3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reinaldo.StudySpringBoot3.entities.Product;


public interface ProductRepository  extends JpaRepository<Product, Long>{
	
}
