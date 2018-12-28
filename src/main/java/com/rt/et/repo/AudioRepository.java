package com.rt.et.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rt.et.entity.Audio;


public interface AudioRepository extends CrudRepository<Audio, Integer>{
	
}
