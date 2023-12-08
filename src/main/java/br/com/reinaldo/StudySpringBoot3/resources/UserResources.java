package br.com.reinaldo.StudySpringBoot3.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.reinaldo.StudySpringBoot3.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L,"Reinaldo","reinaldo@gmail.com","999999","12345");
		return ResponseEntity.ok().body(u);
	}
}
