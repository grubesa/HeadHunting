package com.josip.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="language", schema="head_hunting")
@Getter
@Setter
public class Language extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5369715860636823837L;
	
	@Column(name= "language_name" , nullable = false)
	private String languageName;
}
