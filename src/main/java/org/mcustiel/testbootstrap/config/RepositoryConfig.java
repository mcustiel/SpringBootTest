package org.mcustiel.testbootstrap.config;

import org.mcustiel.testbootstrap.repository.SampleDao;
import org.mcustiel.testbootstrap.repository.implementation.InMemorySampleDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public SampleDao getSampleDao() {
	return new InMemorySampleDao();
    }

}
