package com.josip.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josip.data.entity.PersonalInfo;

@Repository
public interface CompanyRepository extends JpaRepository<PersonalInfo, Long> {

}
