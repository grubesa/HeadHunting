package com.josip.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="company", schema="head_hunting")
@Getter
@Setter
public class Company extends BaseEntity{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3102320155764237671L;
	
	@Column(nullable = false)
	private String company;
}
