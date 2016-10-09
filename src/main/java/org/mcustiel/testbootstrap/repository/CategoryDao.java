package org.mcustiel.testbootstrap.repository;

import java.util.Optional;

import org.mcustiel.testbootstrap.repository.entity.DashboardEntity;

public interface CategoryDao {
    Optional<DashboardEntity> getById(Long id);

    DashboardEntity create(DashboardEntity entity);
}
