package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.untitledc;

public interface clockinrepo extends JpaRepository<untitledc, Integer>{

	List<untitledc> findAll();
 
	List<untitledc> findAllByEmployeenumberAndLogondate(String no, String string);

}
