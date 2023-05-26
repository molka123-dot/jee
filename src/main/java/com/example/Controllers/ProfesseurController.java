package com.example.Controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Models.Etudiant;
import com.example.Models.Professeur;
import com.example.Repository.IEtudiant;
import com.example.Repository.IProfesseur;

@RestController
@RequestMapping("/prof")
public class ProfesseurController {
	
	 @Autowired
	 private IProfesseur iprofesseur;
	 
	 @PostMapping("/")
	  public Professeur addProfesseur(@RequestBody Professeur prof){
	        return iprofesseur.save(prof);
	    }
	    @PutMapping("/")
	    public Professeur updateProfesseur(@RequestBody Professeur prof){
	        return iprofesseur.saveAndFlush(prof);
	    }
	    @GetMapping("/")
	    public List<Professeur> getAlLProfesseur()
	    {
	        return iprofesseur.findAll();
	    }
	    
	    @DeleteMapping("/")
	    public HashMap<String,String> deleteProfesseur(Long id) {

	        HashMap<String,String> reponse=new HashMap<String,String>();
	        try {
	        	Professeur c=iprofesseur.getById(id);
	            iprofesseur.deleteById(id);
	            reponse.put("state","true");
	            return reponse;
	        } catch (Exception e) {
	            reponse.put("state","false");

	            return reponse;
	        

}
}
}

