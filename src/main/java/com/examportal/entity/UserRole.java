package com.examportal.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class UserRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roleid;

	// User
	@ManyToOne(fetch = FetchType.EAGER)
	private UserEntity user;
	
	//For Role
	@ManyToOne(fetch = FetchType.EAGER)
	private Role role;

}
