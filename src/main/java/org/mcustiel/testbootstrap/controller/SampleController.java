package org.mcustiel.testbootstrap.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.inject.Inject;
import javax.xml.ws.http.HTTPException;

import org.mcustiel.testbootstrap.domain.Sample;
import org.mcustiel.testbootstrap.input.SampleRequest;
import org.mcustiel.testbootstrap.service.SampleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sample", consumes = { "application/hal+json",
	"application/vnd.mcustiel-sample-v1+json" }, produces = { "application/hal+json" })
public class SampleController {
    @Inject
    private SampleService sampleService;

    public SampleController(SampleService sampleService) {
	this.sampleService = sampleService;
    }

    @RequestMapping(value = "/{id}", method = GET)
    public ResponseEntity<SampleRequest> getSampleById(
	    @PathVariable int sampleId) {
	Sample sample;
	try {
	    sample = sampleService.getById(sampleId);
	} catch (Exception e) {
	    throw new HTTPException("dCoult not ", 500);
	}
	return new ResponseEntity<SampleRequest>(
SampleRequest.builder()
		.withId(sample.getId()).withAge(sample.getAge())
		.withFirstName(sample.getFirstName())
		.withLastName(sample.getLastName()).build(), HttpStatus.OK);
    }

    @RequestMapping(method = POST)
    public ResponseEntity<SampleRequest> createSample(SampleRequest sample) {
	Sample domainSample = sampleService.createSample(sample.toSample());
	sample.setId(domainSample.getId());
	return new ResponseEntity<SampleRequest>(sample, HttpStatus.CREATED);
    }
}
