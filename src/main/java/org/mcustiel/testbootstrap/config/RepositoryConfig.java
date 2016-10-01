package org.mcustiel.testbootstrap.config;

import org.mcustiel.testbootstrap.repository.DashboardDao;
import org.mcustiel.testbootstrap.repository.implementation.InMemoryDashboardDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {
    @Bean
    public DashboardDao getDashboardDao() {
	return new InMemoryDashboardDao();
    }

}
