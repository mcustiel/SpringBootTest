package org.mcustiel.testbootstrap.converters;

import org.mcustiel.testbootstrap.domain.Dashboard;
import org.mcustiel.testbootstrap.input.DashboardResource;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DashboardToDashboardResourceConverter implements
	Converter<Dashboard, DashboardResource> {

    @Override
    public DashboardResource convert(Dashboard dashboard) {
	return DashboardResource.builder().withId(dashboard.getId().getValue())
		.withName(dashboard.getName())
		.withPosition(dashboard.getPosition())
		.withUserId(dashboard.getUser().getId().getValue())
		.build();
    }
}
