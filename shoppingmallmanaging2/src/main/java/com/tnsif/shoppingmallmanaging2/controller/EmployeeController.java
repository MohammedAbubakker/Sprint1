package com.tnsif.shoppingmallmanaging2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.shoppingmallmanaging2.employee.employee;
import com.tnsif.shoppingmallmanaging2.repository.employeeRepository;

@RestController

public class EmployeeController {
	@Autowired
	
	
	employeeRepository repo;
	@PostMapping("/employee")
	public employee addEmployee(@RequestBody employee e)
	
	 {
		
		
		return repo.save(e);
		
		
		
	}
	@GetMapping("/employee")
	public List<employee> getemployee()
	{
		return repo.findAll();
	}
	
	@GetMapping ("/employee/{id}")
	public employee getEmployeebyId(@PathVariable Integer id)
	{
		return repo.findById(id).get();
	}
	@DeleteMapping("/employee/{id}")
	public void deleteemployee(@PathVariable Integer id)
	{
		repo.deleteById(id);
	}
	@PutMapping("/employee/{id}")
	public employee updateemployee(@PathVariable Integer id,@RequestBody employee e)
	{
		e.setId(id);
		return repo.save(e);
		
	}

}
