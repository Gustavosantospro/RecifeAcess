package com.apiacess.apiacess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiacess.apiacess.model.Estabelecimento;

@Repository
public interface CompaniesRepository extends JpaRepository<Estabelecimento, Long> {

}
