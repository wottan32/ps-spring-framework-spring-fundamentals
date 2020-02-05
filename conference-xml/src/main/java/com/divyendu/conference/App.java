package com.divyendu.conference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.divyendu.conference.service.SpeakerService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        
        System.out.println(service.findAll().get(0).getLastName());
    }
}
