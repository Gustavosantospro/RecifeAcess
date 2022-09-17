package com.apiacess.apiacess.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apiacess.apiacess.model.Estabelecimento;
import com.apiacess.apiacess.repository.CompaniesRepository;

@Controller
public class AcessController {

	@Autowired
	private CompaniesRepository companiesRepository;
	
	// listar todos os estabelecimento
	@GetMapping("/listarEstabelecimentos")
	public List<Estabelecimento> getAllcompanies(){
		
		List<Estabelecimento> estabelecimentos = companiesRepository.findAll();		
		return estabelecimentos;
	}
	
	// cadastro de Estabelecimentos
	@PostMapping("/cadastrarEstabelecimento")
	public void saveCompany(@RequestBody Estabelecimento company) {
		companiesRepository.save(company);
	}
	
}
