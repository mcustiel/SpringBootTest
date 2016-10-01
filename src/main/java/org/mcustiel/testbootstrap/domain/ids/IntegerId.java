package org.mcustiel.testbootstrap.domain.ids;

import org.mcustiel.testbootstrap.utils.ValueObject;

public class IntegerId implements ValueObject<Integer> {
    Integer id;

    public IntegerId(Integer id) {
	this.id = id;
    }

    @Override
    public Integer getValue() {
	return id;
    }
}
