package org.mcustiel.testbootstrap.repository.implementation;

import java.util.Optional;

import javax.inject.Inject;

import org.mcustiel.testbootstrap.repository.DashboardDao;
import org.mcustiel.testbootstrap.repository.entity.DashboardEntity;
import org.springframework.stereotype.Service;

@Service
public class SpringDataJpaDashboardDao implements DashboardDao {

    private SpringDataJpaDashboardDaoRepository repository;

    @Inject
    public SpringDataJpaDashboardDao(
	    SpringDataJpaDashboardDaoRepository repository) {
	this.repository = repository;
    }

    @Override
    public Optional<DashboardEntity> getById(Long id) {
	return repository.getById(id);
    }

    @Override
    public DashboardEntity create(DashboardEntity entity) {
	// TODO Auto-generated method stub
	return null;
    }

}
