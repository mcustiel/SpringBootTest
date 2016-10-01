package org.mcustiel.testbootstrap.domain;

import org.mcustiel.testbootstrap.domain.ids.IntegerId;

public class Bookmarks {
    IntegerId id;
    int position;
    String url;
    String name;
    Category category;
    boolean clicked;
    String note;
    String favicon;

    public IntegerId getId() {
	return id;
    }

    public int getPosition() {
	return position;
    }

    public String getUrl() {
	return url;
    }

    public String getName() {
	return name;
    }

    public Category getCategory() {
	return category;
    }

    public boolean isClicked() {
	return clicked;
    }

    public String getNote() {
	return note;
    }

    public String getFavicon() {
	return favicon;
    }

}
