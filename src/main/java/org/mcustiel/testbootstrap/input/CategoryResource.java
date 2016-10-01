package org.mcustiel.testbootstrap.input;



public class CategoryResource {
    Integer id;
    int position;
    String name;
    Integer dashboardId;
    String hidden;
    int side;
    String color;

    public CategoryResource() {
    }

    public CategoryResource(Builder builder) {
	id = builder.id;
	position = builder.position;
	name = builder.name;
	dashboardId = builder.dashboardId;
	hidden = builder.hidden;
	side = builder.side;
	color = builder.color;
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

    public int getDashboardId() {
	return dashboardId;
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

    public void setId(Integer id) {
	this.id = id;
    }

    public void setPosition(int position) {
	this.position = position;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setDashboardId(int dashboardId) {
	this.dashboardId = dashboardId;
    }

    public void setHidden(String hidden) {
	this.hidden = hidden;
    }

    public void setSide(int side) {
	this.side = side;
    }

    public void setColor(String color) {
	this.color = color;
    }

    public static Builder builder() {
	return new Builder();
    }

    public static class Builder {
	Integer id;
	int position;
	String name;
	int dashboardId;
	String hidden;
	int side;
	String color;

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

	public Builder withDashboardId(int dashboardId) {
	    this.dashboardId = dashboardId;
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

	public CategoryResource build() {
	    return new CategoryResource(this);
	}
    }
}
