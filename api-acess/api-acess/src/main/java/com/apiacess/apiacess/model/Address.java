package com.apiacess.apiacess.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Entity
@Data
@Entity
public class Address {

    @Id
    private Long id;
    private String address;
    private String number;
    private String district;
    private Integer cep;





}
