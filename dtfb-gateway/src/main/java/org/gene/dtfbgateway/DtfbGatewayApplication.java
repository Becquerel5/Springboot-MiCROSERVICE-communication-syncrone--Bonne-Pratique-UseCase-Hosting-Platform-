package org.gene.dtfbgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DtfbGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtfbGatewayApplication.class, args);
	}

	@Bean
	DiscoveryClientRouteDefinitionLocator discoveryClientRouteDefinitionLocator(
			ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp
			){
		return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);

	}

}
