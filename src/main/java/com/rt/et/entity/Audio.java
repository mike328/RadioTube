package com.rt.et.entity;


import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Table(name="Audios")
@RequiredArgsConstructor
public class Audio 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer aid;	
	
	private String path;
	private int rating;
	private int channelid;
	private int programtypeid;
	private String description;
	private String imgpath;
	private String dateuploaded;
	private String datetransmitted;
	private float length;
	
	
}
