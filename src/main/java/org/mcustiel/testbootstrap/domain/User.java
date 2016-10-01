package org.mcustiel.testbootstrap.domain;

import org.mcustiel.testbootstrap.domain.ids.UserId;

public class User {
    UserId id;
    String name;

    public UserId getId() {
	return id;
    }

    public String getName() {
	return name;
    }
}
