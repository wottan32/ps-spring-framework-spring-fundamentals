package com.divyendu.conference.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.divyendu.conference.model.Speaker;
import com.divyendu.conference.repository.SpeakerRepository;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService{
	
	 private SpeakerRepository repository;
	 
	
	 public SpeakerServiceImpl() {
		 System.out.println("Inside SpeakerService no args contructor");
	 }
	 
	 @Autowired
	 public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		 System.out.println("Inside SpeakerService SpeakerRepository contructor");
		 repository = speakerRepository;
	 }
	 
	 @PostConstruct
	 private void initialize() {
		 System.out.println("We're called after the constructors");
	 }
	 
	 
	 public List<Speaker> findAll(){
		 return repository.findAll();
	 }

	
	public void setRepository(SpeakerRepository repository) {
		System.out.println("Inside setRepository setter");
		this.repository = repository;
	}
	 
	 
}
