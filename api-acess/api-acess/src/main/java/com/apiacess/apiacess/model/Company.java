package com.apiacess.apiacess.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String contact;
	private CompanyType companyType;
	private int nivelAcesso;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	@OneToMany
	private Category category;

	
}
