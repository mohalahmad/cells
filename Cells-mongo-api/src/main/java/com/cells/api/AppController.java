package com.cells.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import com.cells.api.Cells;
import com.cells.api.CellsRepository;

@RestController
@RequestMapping("/cells")

public class AppController {

	@Autowired
	private CellsRepository repository;
	

	@GetMapping("/2g")
	public  @ResponseBody ResponseEntity<?> findcell(@RequestParam(name="siteid") int siteid)
	{	
		if (repository.existsBysiteid(siteid))
		{	
			Cells2G cell = new Cells2G();
			cell=repository.findBysiteid(siteid);
			return new ResponseEntity<>(cell,HttpStatus.OK);
		}
		else {
		return new ResponseEntity<>("Cells dose not exists",HttpStatus.OK);
	    }
	}
}