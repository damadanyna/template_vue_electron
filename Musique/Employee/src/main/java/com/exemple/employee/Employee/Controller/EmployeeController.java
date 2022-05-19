package com.exemple.employee.Employee.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.exemple.employee.Employee.Note.Employee;
import com.exemple.employee.Employee.Repository.EmployeeRepository;
import com.exemple.employee.Employee.ResourceNotFoundException.ResourceNotFoundException;

public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	// Get All Notes
	@GetMapping("/")
	public List<Employee> getAllNotes() {
	    return employeeRepository.findAll();
	}
	// Create a new Note
	@PostMapping("/")
	public Employee createNote(@Valid @RequestBody Employee employee) {
	    return employeeRepository.save(employee);
	}
	// Get a Single Note
	@GetMapping("/{id}")
	public Employee getNoteById(@PathVariable(value = "id") Long id) {
	    return employeeRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Note", "id", id));
	}
	// Update a Note
	@PutMapping("/{id}")
	public Employee updateNote(@PathVariable(value = "id") Long noteId,
	                                        @Valid @RequestBody Employee employeeDetail) {

		Employee employee = employeeRepository.findById(noteId)
	            .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

	    employee.setNom(employeeDetail.getNom());
	    employee.setPrenom(employeeDetail.getPrenom());

	    Employee updatedNote = employeeRepository.save(employee);
	    return updatedNote;
	}
	// Delete a Note
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long id) {
		Employee note = employeeRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Note", "id", id));

		employeeRepository.delete(note);

	    return ResponseEntity.ok().build();
	}
}
