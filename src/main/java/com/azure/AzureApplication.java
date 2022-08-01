package com.azure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureApplication {
	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class);
		System.out.println(AzureApplication.class.getSimpleName() + " started!");
	}
}
