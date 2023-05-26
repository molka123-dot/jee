package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Models.Professeur;

@Repository
public interface IProfesseur  extends JpaRepository<Professeur,Long> {
	
}