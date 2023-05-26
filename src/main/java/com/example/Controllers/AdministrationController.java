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
import com.example.Models.Administration;
import com.example.Repository.IAdministration;

@RestController
@RequestMapping("/admin")
public class AdministrationController {
	
	 @Autowired
	 private IAdministration iadmin;
	 
	 @PostMapping("/")
	    public Administration addAdministration(@RequestBody Administration admin){
	        return iadmin.save(admin);
	    }
	    @PutMapping("/")
	    public Administration updateAdministration(@RequestBody Administration admin){
	        return iadmin.saveAndFlush(admin);
	    }
	    @GetMapping("/")
	    public List<Administration> getAlLAdministration()
	    {
	        return iadmin.findAll();
	    }
	    
	    @DeleteMapping("/")
	    public HashMap<String,String> deleteAdministration(Long id) {

	        HashMap<String,String> reponse=new HashMap<String,String>();
	        try {
	        	Administration c=iadmin.getById(id);
	        	iadmin.deleteById(id);
	            reponse.put("state","true");
	            return reponse;
	        } catch (Exception e) {
	            reponse.put("state","false");

	            return reponse;
	        

}
}
}
