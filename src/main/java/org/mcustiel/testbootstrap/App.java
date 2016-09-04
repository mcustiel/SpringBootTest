package org.mcustiel.testbootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class App {
    public static void main(String[] args) throws Exception {
	System.out.println("Starting application...");
	SpringApplication.run(App.class, args);
    }
}