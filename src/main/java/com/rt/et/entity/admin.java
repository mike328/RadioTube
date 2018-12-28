package com.rt.et.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="admin")

public class admin {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	 
	private String username;
	private String pass;

}
