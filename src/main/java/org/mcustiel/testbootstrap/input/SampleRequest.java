package org.mcustiel.testbootstrap.input;

import org.mcustiel.testbootstrap.domain.Sample;
import org.springframework.hateoas.ResourceSupport;

public class SampleRequest extends ResourceSupport {
    private int id;
    private int age;
    private String firstName;
    private String lastName;

    public SampleRequest() {

    }

    public SampleRequest(SampleRequest request) {
	this.id = request.id;
	this.age = request.age;
	this.firstName = request.firstName;
	this.lastName = request.lastName;
    }

    public int getAge() {
	return age;
    }

    public String getFirstName() {
	return firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public int getSampleId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public Sample toSample() {
	return Sample.builder().withAge(age).withFirstName(firstName)
		.withLastName(lastName).withId(id).build();
    }

    public static Builder builder() {
	return new Builder();
    }

    static public class Builder {
	private int id;
	private int age;
	private String firstName;
	private String lastName;

	public Builder withId(int id) {
	    this.id = id;
	    return this;
	}

	public Builder withAge(int age) {
	    this.age = age;
	    return this;
	}

	public Builder withFirstName(String firstName) {
	    this.firstName = firstName;
	    return this;
	}

	public Builder withLastName(String lastName) {
	    this.lastName = lastName;
	    return this;
	}

	public SampleRequest build() {
	    return new SampleRequest(this);
	}
    }
}
