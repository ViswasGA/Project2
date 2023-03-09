package com.example.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Icecream;

public interface Myrepo2 extends JpaRepository<Icecream,Long> {
	

}
