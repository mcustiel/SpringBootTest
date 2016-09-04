package org.mcustiel.testbootstrap.repository;

import java.util.List;

import org.mcustiel.testbootstrap.domain.Sample;

public interface SampleDao {
    Sample add(Sample sample);

    Sample get(int sampleId) throws Exception;

    List<Sample> getAll();
}
