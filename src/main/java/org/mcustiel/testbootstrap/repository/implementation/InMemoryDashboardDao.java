package org.mcustiel.testbootstrap.repository.implementation;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.mcustiel.testbootstrap.repository.DashboardDao;
import org.mcustiel.testbootstrap.repository.entity.DashboardEntity;

public class InMemoryDashboardDao implements DashboardDao {
    List<DashboardEntity> dashboards;

    public InMemoryDashboardDao() {
	dashboards = new LinkedList<DashboardEntity>();
    }

    @Override
    public Optional<DashboardEntity> getDashboard(Long id) {
	try {
	    return Optional.of(dashboards.get(id.intValue() - 1));
	} catch (IndexOutOfBoundsException e) {
	    return Optional.empty();
	}
    }

    @Override
    synchronized public DashboardEntity createDashboard(DashboardEntity entity) {
	entity.setId(new Long(dashboards.size() + 1));
	dashboards.add(entity);
	return entity;
    }
}
