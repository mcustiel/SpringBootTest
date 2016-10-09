package org.mcustiel.testbootstrap.config;

import org.mcustiel.testbootstrap.repository.DashboardDao;
import org.mcustiel.testbootstrap.repository.implementation.InMemoryDashboardDao;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan
@EnableJpaRepositories
public class RepositoryConfig {
    @Bean
    public DashboardDao getDashboardDao() {
	return new InMemoryDashboardDao();
    }
}
