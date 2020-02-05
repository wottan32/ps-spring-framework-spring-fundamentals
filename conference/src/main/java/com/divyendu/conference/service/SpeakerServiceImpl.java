package com.divyendu.conference.service;

import java.util.List;

import com.divyendu.conference.model.Speaker;
import com.divyendu.conference.repository.HibernateSpeakerRepositoryImpl;
import com.divyendu.conference.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService{
	
	 private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
	 
	 public List<Speaker> findAll(){
		 return repository.findAll();
	 }
}
