package org.bzu.exp.repository;

import java.util.List;

import org.bzu.exp.model.ExpModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExpRepository extends JpaRepository<ExpModel, Long> {

	List<ExpModel> findAll();
	
	List<ExpModel> findAllByAttr1(String attr1);
	
}
