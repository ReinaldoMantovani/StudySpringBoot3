package br.com.reinaldo.StudySpringBoot3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reinaldo.StudySpringBoot3.entities.OrderItem;


public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{
	
}
