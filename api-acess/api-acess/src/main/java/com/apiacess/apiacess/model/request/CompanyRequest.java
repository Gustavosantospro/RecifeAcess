package com.apiacess.apiacess.model.request;

import com.apiacess.apiacess.model.Address;
import com.apiacess.apiacess.model.Category;
import com.apiacess.apiacess.model.Company;
import com.apiacess.apiacess.model.CompanyType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder
public class CompanyRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private CompanyType companyType;
    private String contact;

    private Address address;
    //private Category category;



    public static Company toDomain(CompanyRequest companyRequest) {
        return Company.builder()
                .name(companyRequest.name)
                .companyType((CompanyType) companyRequest.companyType)
                .contact(companyRequest.contact)
                .address(companyRequest.address)
                //.category(companyRequest.category)
                .build();
    }
}
