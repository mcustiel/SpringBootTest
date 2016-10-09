package org.mcustiel.testbootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) throws Exception {
	System.out.println("Starting application...");
	SpringApplication.run(App.class, args);
    }
}
