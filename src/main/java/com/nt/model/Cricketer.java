package com.nt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "cricketer_info")
public class Cricketer {
	@Id
	@GeneratedValue
	private Integer cricketerId;
	@Column(length = 20)
	private String cricketerName;
	@Column(length = 20)
	private String cricketerType;
	private Date dob;
	private Date debutDate;

}
