package com.divyendu.conference.repository;

import java.util.List;

import com.divyendu.conference.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();
}
