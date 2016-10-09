package org.mcustiel.testbootstrap.repository;

import java.util.List;
import java.util.Optional;

import org.mcustiel.testbootstrap.repository.entity.DashboardEntity;

public interface DashboardDao {
    Optional<DashboardEntity> getById(Long id);

    DashboardEntity create(DashboardEntity entity);

    List<DashboardEntity> list();
}
