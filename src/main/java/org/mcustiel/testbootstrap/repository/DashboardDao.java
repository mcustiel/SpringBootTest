package org.mcustiel.testbootstrap.repository;

import java.util.Optional;

import org.mcustiel.testbootstrap.repository.entity.DashboardEntity;

public interface DashboardDao {
    Optional<DashboardEntity> getDashboard(Long id);

    DashboardEntity createDashboard(DashboardEntity entity);
}
