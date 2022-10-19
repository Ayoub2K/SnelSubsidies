package com.example.subsidieradar;

import com.example.subsidieradar.data.SubsidieRadarRepository;
import com.example.subsidieradar.domain.Subsidie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Date;

@SpringBootApplication
public class SubsidieRadarApplication {
	public static void main(String[] args) {

		Subsidie s1 = new Subsidie("subsidieNaam", "subsidievestrekker", "subsidialeActiviteiten",
				new Date("17-02-2020"), 12, new Date("27-02-2020"), new Date("17-02-2021"),
				"beoordelingssystematiek", "websitelink");

		SpringApplication.run(SubsidieRadarApplication.class, args);
	}
}
