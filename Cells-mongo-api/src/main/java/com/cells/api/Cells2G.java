package com.cells.api;

//import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Cells2G {
	
	private int siteid;
	private int cellid;
	private String hexadecimal;
	private String governorate;
	
	public Cells2G(){}

	public Cells2G(int siteid , int cellid , String hexadecimal , String governorate ){
		this.siteid=siteid;
		this.cellid=cellid;
		this.hexadecimal=hexadecimal;
		this.governorate=governorate;	
	}
	public int getsiteid() {
		return siteid;
	}

	public void setsiteid(int siteid) {
		this.siteid = siteid;
	}
	
	public int getcellid() {
		return cellid;
	}

	public void setcellid(int cellid) {
		this.cellid = cellid;
	}
	
	public String gethexadecimal() {
		return hexadecimal;
	}

	public void sethexadecimal(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}
	
	public String getgovernorate() {
		return governorate;
	}

	public void setgovernorate(String governorate) {
		this.governorate = governorate;
	}
}

	 
