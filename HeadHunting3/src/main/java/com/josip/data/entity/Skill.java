package com.josip.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="skill", schema="head_hunting")
@Getter
@Setter
public class Skill extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5735472517880735374L;
	
	@Column(nullable = false)
	private String skill;
}
