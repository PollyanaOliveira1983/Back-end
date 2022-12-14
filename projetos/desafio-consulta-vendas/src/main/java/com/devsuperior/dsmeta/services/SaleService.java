package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.dto.SaleMinDTO;
import com.devsuperior.dsmeta.dto.SaleRepoDTO;
import com.devsuperior.dsmeta.dto.SaleSummaryDTO;
import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.projections.SaleRepoProjection;
import com.devsuperior.dsmeta.projections.SaleSummaryProjection;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public SaleMinDTO findById(Long id) {
		Optional<Sale> result = repository.findById(id);
		Sale entity = result.get();
		return new SaleMinDTO(entity);
	}
	
	public List<SaleSummaryDTO> getSummary (String minDate, String maxDate) {
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate lastYear = today.minusYears(1L);
		
		LocalDate min = "".equals(minDate) ? lastYear : LocalDate.parse(minDate);
		LocalDate max = "".equals(maxDate) ? today : LocalDate.parse(maxDate);
		
		List<SaleSummaryProjection> result = repository.summary(min, max);
		
		return result.stream().map(x -> new SaleSummaryDTO(x)).collect(Collectors.toList());
	}
	
	public List<SaleRepoDTO> getReport (String minDate, String maxDate, String nameSale){
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate lastYear = today.minusYears(1L);
		
		LocalDate min = "".equals("") ? lastYear : LocalDate.parse(minDate);
		LocalDate max = "".equals("") ? today : LocalDate.parse(maxDate);
		
		List<SaleRepoProjection> result = repository.report(min, max, nameSale);
		
		return result.stream().map(x -> new SaleRepoDTO(x)).collect(Collectors.toList());
		
	}
}
