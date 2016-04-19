package com.josip.data.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="experience", schema="head_hunting")
@Getter
@Setter
public class Experience extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2273718171396295195L;

	@Column(name= "start_date" , nullable = false)
	private ZonedDateTime startDate;
	
	@Column(name= "finish_date" , nullable = false)
	private ZonedDateTime finishDate;
}
