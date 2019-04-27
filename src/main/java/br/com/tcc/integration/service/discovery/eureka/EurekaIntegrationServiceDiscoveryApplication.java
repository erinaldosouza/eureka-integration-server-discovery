package br.com.tcc.integration.service.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration
public class EurekaIntegrationServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaIntegrationServiceDiscoveryApplication.class, args);
	}

}
