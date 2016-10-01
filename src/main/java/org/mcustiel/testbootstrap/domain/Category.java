package org.mcustiel.testbootstrap.domain;

import org.mcustiel.testbootstrap.domain.ids.CategoryId;

public class Category {
    CategoryId id;
    int position;
    String name;
    Dashboard dashboard;
    String hidden;
    int side;
    String color;

    private Category(Builder builder) {
	id = builder.id;
	position = builder.position;
	name = builder.name;
	dashboard = builder.dashboard;
	hidden = builder.hidden;
	side = builder.side;
	color = builder.color;
    }

    public CategoryId getId() {
	return id;
    }

    public int getPosition() {
	return position;
    }

    public String getName() {
	return name;
    }

    public Dashboard getDashboard() {
	return dashboard;
    }

    public String getHidden() {
	return hidden;
    }

    public int getSide() {
	return side;
    }

    public String getColor() {
	return color;
    }

    public static Builder builder() {
	return new Builder();
    }

    public static class Builder {
	CategoryId id;
	int position;
	String name;
	Dashboard dashboard;
	String hidden;
	int side;
	String color;

	public Builder withId(CategoryId id) {
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

	public Builder withDashboard(Dashboard dashboard) {
	    this.dashboard = dashboard;
	    return this;
	}

	public Builder withHidden(String hidden) {
	    this.hidden = hidden;
	    return this;
	}

	public Builder withSide(int side) {
	    this.side = side;
	    return this;
	}

	public Builder withColor(String color) {
	    this.color = color;
	    return this;
	}

	public Category build() {
	    return new Category(this);
	}
    }
}
