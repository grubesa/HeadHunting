package com.josip.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="language_rating", schema="head_hunting")
@Getter
@Setter
public class LanguageRating extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4341032613070243531L;
	
	@Column(nullable = false)
	private String rating;
}
