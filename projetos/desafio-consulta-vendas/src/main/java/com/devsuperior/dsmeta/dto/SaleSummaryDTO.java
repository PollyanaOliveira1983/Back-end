package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.projections.SaleSummaryProjection;

public class SaleSummaryDTO {

	 private String name;
     private Double total;


     public SaleSummaryDTO(){

     }


	public SaleSummaryDTO(String name, Double total) {
		this.name = name;
		this.total = total;
	}
	
	public SaleSummaryDTO(SaleSummaryProjection projection) {
		name = projection.getName();
		total = projection.getTotal();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}
	
	
     
     
     
     
}
