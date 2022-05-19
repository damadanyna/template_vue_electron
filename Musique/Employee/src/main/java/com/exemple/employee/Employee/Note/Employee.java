package com.exemple.employee.Employee.Note;
import java.io.*;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(length=100)
	private String nom;
	
	@Column(length=100)
	private String prenom;
	
	@Column(length=100)
	private String email;
	
	public Employee() {}
	
	public Employee(int id,String nom,String prenom,String email) {
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
