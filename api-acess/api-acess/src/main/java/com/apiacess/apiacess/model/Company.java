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
@Builder
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PK_COMPANY")
	private Long id;
	private String name;
	private String contact;
	private CompanyType companyType;


	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

//	@ManyToOne(cascade = CascadeType.ALL)
//	private Category category;


}
