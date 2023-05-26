package com.example.Models;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

	@Entity
	@Table(name="Professeurs")
	public class Professeur implements Serializable {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column(name = "firstname")
	    private String firstname;
	    @Column(name = "lastname")
	    private String lastname;
	    @Column(name = "email")
	    private String email;
	   
	    @ManyToOne
	    private Administration administtration;
	    
	    @ManyToMany
	    private List<Etudiant> etudiants ;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Administration getAdministtration() {
			return administtration;
		}

		public void setAdministtration(Administration administtration) {
			this.administtration = administtration;
		}

		public List<Etudiant> getEtudiants() {
			return etudiants;
		}

		public void setEtudiants(List<Etudiant> etudiants) {
			this.etudiants = etudiants;
		}

		

}
