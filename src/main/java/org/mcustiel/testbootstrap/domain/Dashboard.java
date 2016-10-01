package org.mcustiel.testbootstrap.domain;

import org.mcustiel.testbootstrap.domain.ids.DashboardId;

public class Dashboard {
    DashboardId id;
    int position;
    String name;
    User user;

    private Dashboard(Builder builder) {
	id = builder.id;
	position = builder.position;
	name = builder.name;
	user = builder.user;
    }

    public DashboardId getId() {
	return id;
    }

    public int getPosition() {
	return position;
    }

    public String getName() {
	return name;
    }

    public User getUser() {
	return user;
    }

    public static Builder builder() {
	return new Builder();
    }

    public static class Builder {
	DashboardId id;
	int position;
	String name;
	User user;

	public Builder withId(DashboardId id) {
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

	public Builder withUser(User user) {
	    this.user = user;
	    return this;
	}

	public Dashboard build() {
	    return new Dashboard(this);
	}
    }
}
