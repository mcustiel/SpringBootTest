package org.mcustiel.testbootstrap.services;

import java.util.Optional;

import javax.inject.Inject;

import org.mcustiel.testbootstrap.domain.Dashboard;
import org.mcustiel.testbootstrap.domain.ids.DashboardId;
import org.mcustiel.testbootstrap.repository.DashboardDao;
import org.mcustiel.testbootstrap.repository.entity.DashboardEntity;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {
    private DashboardDao dashboardDao;
    private ConversionService conversion;

    @Inject
    public DashboardService(DashboardDao dashboardDao,
	    ConversionService conversion) {
	this.dashboardDao = dashboardDao;
	this.conversion = conversion;
    }

    public Optional<Dashboard> getById(DashboardId id) {
	Optional<DashboardEntity> dashboard = dashboardDao.getById(id
		.getValue()
		.longValue());
	if (dashboard.isPresent()) {
	    return Optional.of(conversion.convert(dashboard, Dashboard.class));
	}
	return Optional.empty();
    }
    
    public Dashboard createDashboard(Dashboard dashboard) {
	DashboardEntity entity = dashboardDao.create(conversion.convert(
		dashboard,
		DashboardEntity.class));
	return dashboard.withId(new DashboardId(entity.getId().intValue()));
    }
}
