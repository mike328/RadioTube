package com.rt.et.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="channel")
public class Channel {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private String channelname;
	
	

}
