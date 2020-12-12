package ma.enset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;

@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
	@Bean
	DiscoveryClientRouteDefinitionLocator definitionLocator(ReactiveDiscoveryClient r, DiscoveryLocatorProperties p){
		return new DiscoveryClientRouteDefinitionLocator(r,p);
	}

/*
	@Bean
	RouteLocator routeLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("r1",(r)->r.path("/customers/**").uri("http://localhost:8081/"))
				.route("r2",(r)->r.path("/prodects/**").uri("http://localhost:8082/"))
				.build();

	}
	*/
	
}
