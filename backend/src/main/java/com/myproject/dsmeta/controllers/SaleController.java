package com.myproject.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.dsmeta.entity.Sale;
import com.myproject.dsmeta.services.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public List<Sale> findAll(){
		return saleService.findAll();
	}
}
