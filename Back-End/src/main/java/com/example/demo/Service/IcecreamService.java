package com.example.demo.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Icecream;

import com.example.demo.Repository.Myrepo2;

@Service
public class IcecreamService {

	@Autowired
	private Myrepo2 rep;

// addStudent 
	public Icecream addIcecream(Icecream obj) {
		return rep.save(obj);
	}
//getStudent  
	public List<Icecream> getIcecream() {
		List<Icecream> arr = new ArrayList<>();
		arr = rep.findAll();
		return arr;
	}
//	public List<Icecream> findProductWithSorting(String field)
//	{
//		return rep.findAll(Sort.by(Sort.Direction.ASC,field)) ;
//	}

//deleteById  
	public void deleteIcecream(Long id) {
		rep.deleteById(id);
	}

	public Icecream update(Icecream obj, long id) {
		Icecream sam = rep.findById(id).get();

		if (Objects.nonNull(sam) && (obj.getRate() != 0)) {
			sam.setRate(obj.getRate());
			
		}
		if (Objects.nonNull(sam) && (obj.getQuantity() != 0)) {
			sam.setQuantity(obj.getQuantity());
		}

		if (Objects.nonNull(sam) && (!Objects.isNull(obj.getFlavours()))) {
			sam.setFlavours(obj.getFlavours());
		}
		if (Objects.nonNull(sam) && (obj.getScoops() != 0)) {
			sam.setScoops(obj.getScoops());
			
		}
		if (Objects.nonNull(sam) && (!Objects.isNull(obj.getToppings()))) {
			sam.setToppings(obj.getToppings());
		}
		
		return rep.saveAndFlush(sam);
	}
//	public List<Icecream> showvalues(){
//		Pageable p=PageRequest.of(0, 2,Sort.by(Sort.Direction.ASC,"name"));
//		Page<Icecream>c=rep.findAll(p);
//		return c.toList();
//	}
	
}
