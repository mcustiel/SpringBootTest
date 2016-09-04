package org.mcustiel.testbootstrap.service;

import java.util.List;

import javax.inject.Inject;

import org.mcustiel.testbootstrap.domain.Sample;
import org.mcustiel.testbootstrap.repository.SampleDao;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    @Inject
    private SampleDao dao;

    private SampleService(SampleDao dao) {
	this.dao = dao;
    }

    public Sample createSample(Sample sample) {
	return dao.add(sample);
    }
    
    public Sample getById(int id) throws Exception {
	try {
	    return dao.get(id);
	} catch (Exception e) {
	    throw new Exception("Service exception: get failed", e);
	}
    }
    
    public List<Sample> list() {
	return null;
    }
}
