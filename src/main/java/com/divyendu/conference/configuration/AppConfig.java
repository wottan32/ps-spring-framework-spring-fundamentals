package com.divyendu.conference.configuration;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.divyendu.conference.util.CalendarFactory;

@Configuration
@ComponentScan({"com.divyendu.conference"})
public class AppConfig {
	 
//	@Bean(name = "speakerService")
//	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
//	public SpeakerService getSpeakerService() {
//		//SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//		//service.setRepository(getSpeakerRepository());
//		SpeakerServiceImpl service = new SpeakerServiceImpl();
//		return service;
//	}
	
//	@Bean(name = "speakerRepository")
//	public SpeakerRepository getSpeakerRepository() {
//		return new HibernateSpeakerRepositoryImpl();
//	}
	
	@Bean(name="cal")
	public CalendarFactory calFactory() {
		CalendarFactory factory = new CalendarFactory();
		factory.addDays(2);
		return factory;
	}
	
	@Bean
	public Calendar cal() throws Exception{
		return calFactory().getObject();
	}
}
