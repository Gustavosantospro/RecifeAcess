package com.apiacess.apiacess.controller;

import com.apiacess.apiacess.model.Company;
import com.apiacess.apiacess.model.request.CompanyMapper;
import com.apiacess.apiacess.model.request.CompanyRequest;
import com.apiacess.apiacess.service.CompaniesService;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class AcessController {

	@Autowired
	private CompaniesService companiesService;

	// adicionar estabelecimentos
	@PostMapping("/addEstabelecimentos")
	public ResponseEntity addCompany(@RequestBody CompanyRequest companyRequest){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(companiesService.save(CompanyRequest.toDomain(companyRequest)));
	}
	
	// listar Estabelecimentos
	@GetMapping("/listarEstabelecimentos")
	public ResponseEntity findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(companiesService.findAll());
	}


}
