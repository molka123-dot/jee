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
@Table(name="Administrations")
public class Administration implements Serializable {
	
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;
		    @Column(name = "service")
		    private String service;
		    @Column(name = "tempsDebut")
		    private String tempsDebut;
		    @Column(name = "tempsFin")
		    private String tempsFin;
		   
		    @jakarta.persistence.OneToMany
		    private List<Professeur> professeurs ;
		    
		    @jakarta.persistence.OneToMany
		    private List<Etudiant> etudaints ;

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getService() {
				return service;
			}

			public void setService(String service) {
				this.service = service;
			}

			public String getTempsDebut() {
				return tempsDebut;
			}

			public void setTempsDebut(String tempsDebut) {
				this.tempsDebut = tempsDebut;
			}

			public String getTempsFin() {
				return tempsFin;
			}

			public void setTempsFin(String tempsFin) {
				this.tempsFin = tempsFin;
			}

			public List<Professeur> getProfesseurs() {
				return professeurs;
			}

			public void setProfesseurs(List<Professeur> professeurs) {
				this.professeurs = professeurs;
			}

			public List<Etudiant> getEtudaints() {
				return etudaints;
			}

			public void setEtudaints(List<Etudiant> etudaints) {
				this.etudaints = etudaints;
			}


			
	}


