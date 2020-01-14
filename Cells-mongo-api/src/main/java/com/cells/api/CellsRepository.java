package com.cells.api;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.cells.api.Cells2G;


public interface CellsRepository extends MongoRepository<Cells2G , String> {

	public Cells2G findBysiteid(int siteid);
	public boolean existsBysiteid(int siteid);


}
