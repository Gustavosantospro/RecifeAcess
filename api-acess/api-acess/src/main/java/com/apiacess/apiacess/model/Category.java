package com.apiacess.apiacess.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category {
    // por que tá vindo o resultado nullo?
    @Id
    private Long id;
    private CompanyType companyType;
//    @OneToMany(mappedBy = "Company")
//    private Company company;


}
