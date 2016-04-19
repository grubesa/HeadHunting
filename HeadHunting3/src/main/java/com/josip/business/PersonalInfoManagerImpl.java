package com.josip.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.josip.data.entity.PersonalInfo;
import com.josip.data.repository.PersonalInfoRepository;

@Component
public class PersonalInfoManagerImpl implements PersonalInfoManager{
	
	@Autowired
	private PersonalInfoRepository personalInfoRepo;
	
	public PersonalInfo getPersonalInfo(String lastName) {
		return personalInfoRepo.findByLastName(lastName);
	}
}
