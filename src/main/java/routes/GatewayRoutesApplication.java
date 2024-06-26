package routes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableCaching
//@EnableDiscoveryClient
//@EnableEurekaClient
public class GatewayRoutesApplication {
	
	private static final Logger logger = LogManager.getLogger(GatewayRoutesApplication.class);

  public static void main(String[] args) {
	 logger.info("Starting API-GATEWAT");
    SpringApplication.run(GatewayRoutesApplication.class, args);
  }
}
