package org.mcustiel.testbootstrap.repository.implementation;

import java.util.LinkedList;
import java.util.List;

import org.mcustiel.testbootstrap.domain.Sample;
import org.mcustiel.testbootstrap.repository.SampleDao;

import com.google.common.collect.ImmutableList;

public class InMemorySampleDao implements SampleDao {

    private List<Sample> samples;

    public InMemorySampleDao() {
	samples = new LinkedList<Sample>();
    }

    @Override
    synchronized public Sample add(Sample sample) {
	samples.add(sample);
	return Sample.builder().withId(samples.size() - 1)
		.withAge(sample.getAge()).withFirstName(sample.getFirstName())
		.withLastName(sample.getLastName()).build();
    }

    @Override
    public Sample get(int sampleId) throws Exception {
	if (sampleId > samples.size()) {
	    throw new Exception("Sample not found");
	}
	
	return samples.get(sampleId + 1);
    }

    @Override
    public List<Sample> getAll() {
	return ImmutableList.copyOf(samples);
    }
}
