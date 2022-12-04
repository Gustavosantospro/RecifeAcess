package com.apiacess.apiacess.model.request;

import com.apiacess.apiacess.model.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class CompanyMapper {
    public static Company fromRequest(CompanyRequest companyRequest){
        return Company.builder()
                .name(companyRequest.getName())
                .address(companyRequest.getAddress())
                .contact(companyRequest.getContact())
                //.companyType(companyRequest.getCompanyType())
                .build();
    }
}
