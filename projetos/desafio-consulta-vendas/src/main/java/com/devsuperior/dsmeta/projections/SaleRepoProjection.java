package com.devsuperior.dsmeta.projections;

import java.time.LocalDate;

public interface SaleRepoProjection {
	
	Long getId();
    LocalDate getDate();
    Double getAmount();
    String getName();

}
