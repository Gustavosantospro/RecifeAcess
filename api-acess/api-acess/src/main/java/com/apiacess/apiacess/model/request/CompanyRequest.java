package com.apiacess.apiacess.model.request;

import com.apiacess.apiacess.model.Address;
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

    //private List<String> itensAcess;
    //private int nivelAcesso;

//    public static Company toDomain(CompanyRequest companyRequest) {
//        return Company.builder()
//                .name(companyRequest.name)
//                .contact(companyRequest.contact)
//                .companyType((CompanyType) companyRequest.companyType)
//                .address(companyRequest.address)
//                //.nivelAcesso(companyRequest.nivelAcesso)
//                .build();
//    }
}
