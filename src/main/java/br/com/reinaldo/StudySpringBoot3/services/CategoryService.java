package br.com.reinaldo.StudySpringBoot3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reinaldo.StudySpringBoot3.entities.Category;
import br.com.reinaldo.StudySpringBoot3.repositories.CategoryRepository;



@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
	 Optional<Category> obj = repository.findById(id);
	 
	 return obj.get();
	}
}
