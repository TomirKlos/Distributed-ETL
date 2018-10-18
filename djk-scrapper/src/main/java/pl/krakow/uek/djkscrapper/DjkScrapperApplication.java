package pl.krakow.uek.djkscrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DjkScrapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(DjkScrapperApplication.class, args);
	}
}
