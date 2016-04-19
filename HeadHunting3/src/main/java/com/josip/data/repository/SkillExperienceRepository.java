package com.josip.data.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josip.data.entity.PersonalInfo;

@Repository
public interface SkillExperienceRepository extends JpaRepository<PersonalInfo, Long> {

}
