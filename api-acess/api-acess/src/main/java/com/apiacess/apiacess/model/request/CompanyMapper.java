package com.apiacess.apiacess.model.request;

import com.apiacess.apiacess.model.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class CompanyMapper {
    public static Company fromRequest(CompanyRequest companyRequest){
        return new Company(null, companyRequest.getName(), companyRequest.getContact(), companyRequest.getCompanyType(), 0, companyRequest.getAddress());
    }
}
