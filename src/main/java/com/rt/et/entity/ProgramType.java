package com.rt.et.entity;

import javax.persistence.*;


import lombok.Data;

@Data
@Entity
@Table(name="programtype")
public class ProgramType {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Enumerated(EnumType.STRING)
	private final Type prtype;
	
	public static enum Type {
		Breakfast, News, Sports,CallIn,Talkshow,Drama,Music
	}
}
