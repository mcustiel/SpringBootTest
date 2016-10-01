package org.mcustiel.testbootstrap.input;

public class DashboardResource {
    Integer id;
    Integer userId;
    int position;
    String name;

    public DashboardResource() {
    }

    public DashboardResource(Builder builder) {
	id = builder.id;
	position = builder.position;
	name = builder.name;
	userId = builder.userId;
    }

    public Integer getId() {
	return id;
    }

    public int getPosition() {
	return position;
    }

    public String getName() {
	return name;
    }

    public Integer getUserId() {
	return userId;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public void setPosition(int position) {
	this.position = position;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setUserId(int userId) {
	this.userId = userId;
    }

    public static Builder builder() {
	return new Builder();
    }

    public static class Builder {
	Integer id;
	int position;
	String name;
	Integer userId;

	public Builder withId(Integer id) {
	    this.id = id;
	    return this;
	}

	public Builder withPosition(int position) {
	    this.position = position;
	    return this;
	}

	public Builder withName(String name) {
	    this.name = name;
	    return this;
	}

	public Builder withUserId(Integer userId) {
	    this.userId = userId;
	    return this;
	}

	public DashboardResource build() {
	    return new DashboardResource(this);
	}
    }
}
