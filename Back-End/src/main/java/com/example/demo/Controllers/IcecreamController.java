package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Icecream;
import com.example.demo.Service.IcecreamService;
	

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class IcecreamController {
	@Autowired
	private IcecreamService stud;
	

	public List<Icecream> showIcecream() {
		return stud.getIcecream();
	}

	@PostMapping("/add")
	public Icecream addIcecream(@RequestBody Icecream obj) {
		return stud.addIcecream(obj);
	}

	@DeleteMapping("/delete/{id}")
	public String delIcecream(@PathVariable Long id) {
		stud.deleteIcecream(id);
		return "Successfully deleted";
	}
    @PutMapping("/update/{id}")
    public Icecream updateIcecream(@RequestBody Icecream obj,@PathVariable long id)
    {
    	return stud.update(obj, id);
    } 
    @GetMapping("/show")
    public List<Icecream> Get()	
    {
    	return stud.getIcecream();
    }
  
}
