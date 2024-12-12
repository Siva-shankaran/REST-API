package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Data_Class;
import com.example.demo.Repositary.Repositary_CLASS;

@RestController
public class Home_Controller {

	@Autowired
	private Repositary_CLASS repo;
		
	    //http://localhost:8080/save
		@PostMapping("/save")
		public Data_Class saveApi(@RequestBody Data_Class data) {
			return repo.save(data);
		}
		
	    //http://localhost:8080/read
		@GetMapping("/read")
		public List<Data_Class> createJSONdata(Data_Class data){
			List<Data_Class> reads = repo.findAll();
			return reads;
			
			
		}
		
		//http://localhost:8080/update
		@PutMapping("/update")
		public void updateApi(@RequestBody Data_Class data) {
			repo.save(data);
		}
		
	    //http://localhost:8080/delete
		@DeleteMapping("/delete/{id}")
		public void deleteByIdApi(@PathVariable("id") int id) {
			repo.deleteById(id);
		}
		
}

