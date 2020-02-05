package com.divyendu.conference;

import com.divyendu.conference.service.SpeakerService;
import com.divyendu.conference.service.SpeakerServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        SpeakerService service = new SpeakerServiceImpl();
        
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
