package org.mcustiel.testbootstrap.repository.implementation;

import java.util.LinkedList;
import java.util.List;
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
	repository.save(entity);
	return entity;
    }

    @Override
    public List<DashboardEntity> list() {
	Iterable<DashboardEntity> iterator = repository.findAll();
	List<DashboardEntity> list = new LinkedList<DashboardEntity>();
	iterator.forEach(dashboardEntity -> {
	    list.add(dashboardEntity);
	});
	return list;
    }
}
