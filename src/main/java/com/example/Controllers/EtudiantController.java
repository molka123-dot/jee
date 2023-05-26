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
import com.example.Repository.IEtudiant;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
	
	 @Autowired
	 private IEtudiant ietudiant;
	 
	 @PostMapping("/")
	    public Etudiant addEtudaint(@RequestBody Etudiant etudiant){
	        return ietudiant.save(etudiant);
	    }
	    @PutMapping("/")
	    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
	        return ietudiant.saveAndFlush(etudiant);
	    }
	    @GetMapping("/")
	    public List<Etudiant> getAlLEtudiant()
	    {
	        return ietudiant.findAll();
	    }
	    
	    @DeleteMapping("/")
	    public HashMap<String,String> deleteEtudiant(Long id) {

	        HashMap<String,String> reponse=new HashMap<String,String>();
	        try {
	            Etudiant c=ietudiant.getById(id);
	            ietudiant.deleteById(id);
	            reponse.put("state","true");
	            return reponse;
	        } catch (Exception e) {
	            reponse.put("state","false");

	            return reponse;
	        

}
	    }}
