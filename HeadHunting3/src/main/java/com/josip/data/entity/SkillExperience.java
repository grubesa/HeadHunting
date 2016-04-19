package com.josip.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="skill_experience", schema="head_hunting")
@Getter
@Setter
public class SkillExperience extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4247158031730983310L;

	@Column(nullable = false)
	private Integer experience;

	@Column(nullable = false)
	private Integer rating;
}
