package com.josip.data.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="personal_info", schema="head_hunting")
@Getter
@Setter
public class PersonalInfo extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1169331968105606536L;

	@Column(name= "first_name" , nullable = false)
	private String firstName;
	
	@Column(name= "last_name" , nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String sex;
	
	@Column(name= "date_of_birth" , nullable = false)
	private ZonedDateTime dateOfBirth;
	
	@Column(nullable = false)
	private String education;
	
	@Column(nullable = false)
	private String photo;
	
	@Column(nullable = false)
	private String interests;
}
