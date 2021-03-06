package org.mcustiel.testbootstrap.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DashboardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private int position;
    private String name;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }
    public Long getUserId() {
	return userId;
    }

    public void setUserId(Long userId) {
	this.userId = userId;
    }
    public int getPosition() {
	return position;
    }

    public void setPosition(int position) {
	this.position = position;
    }
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
}
