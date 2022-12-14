package com.devsuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.dto.SaleMinDTO;
import com.devsuperior.dsmeta.dto.SaleRepoDTO;
import com.devsuperior.dsmeta.dto.SaleSummaryDTO;
import com.devsuperior.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<SaleMinDTO> findById(@PathVariable Long id) {
		SaleMinDTO dto = service.findById(id);
		return ResponseEntity.ok(dto);
	}

	@GetMapping(value = "/summary")
	public ResponseEntity<List<SaleSummaryDTO>> getSummary(
				@RequestParam(name = "minDate", defaultValue = "")  String minDate,
				@RequestParam(name = "maxDate", defaultValue = "") String maxDate)
	{

		List<SaleSummaryDTO> dto = service.getSummary(minDate, maxDate);

		return ResponseEntity.ok(dto);
	}
	
	@GetMapping(value = "/report")
	public ResponseEntity<List<SaleRepoDTO>> getReport(
			@RequestParam(name = "minDate", defaultValue = "")  String minDate,
			@RequestParam(name = "maxDate", defaultValue = "") String maxDate,
			@RequestParam(name= "name", defaultValue = "") String nameSale){

		List<SaleRepoDTO> dto = service.getReport(minDate, maxDate, nameSale);

		return ResponseEntity.ok(dto);
	}

		

	
}
