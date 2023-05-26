package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Models.Etudiant;

@Repository
public interface IEtudiant  extends JpaRepository<Etudiant,Long> {
	
}
