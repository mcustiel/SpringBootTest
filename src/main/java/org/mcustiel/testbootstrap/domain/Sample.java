package org.mcustiel.testbootstrap.domain;

public class Sample {
    private int id;
    private int age;
    private String firstName;
    private String lastName;

    private Sample(Builder builder) {
	this.id = builder.id;
	this.age = builder.age;
	this.firstName = builder.firstName;
	this.lastName = builder.lastName;
    }

    public int getAge() {
	return age;
    }

    public int getId() {
	return id;
    }

    public String getFirstName() {
	return firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public static Builder builder() {
	return new Builder();
    }

    public static class Builder {
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

	public Sample build() {
	    return new Sample(this);
	}
    }
}