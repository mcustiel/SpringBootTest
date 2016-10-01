package org.mcustiel.testbootstrap.repository.implementation;

import java.util.Optional;

import org.mcustiel.testbootstrap.repository.entity.DashboardEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJpaDashboardDaoRepository extends
	CrudRepository<DashboardEntity, Long> {

    @Query("SELECT * FROM dashboards d INNER JOIN users u ON d.user = u.id WHERE d.id = ?1")
    Optional<DashboardEntity> getById(Long id);

}
