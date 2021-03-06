package pl.krakow.uek.djkentrydataproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DjkEntryDataProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DjkEntryDataProducerApplication.class, args);
	}
}
