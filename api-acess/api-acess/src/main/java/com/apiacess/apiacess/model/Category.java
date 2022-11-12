package com.apiacess.apiacess.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Category {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Company company;

    private CompanyType companyType;
}
