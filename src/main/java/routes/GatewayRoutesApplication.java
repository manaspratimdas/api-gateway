package routes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableCaching
//@EnableDiscoveryClient
//@EnableEurekaClient
public class GatewayRoutesApplication {

  public static void main(String[] args) {
    SpringApplication.run(GatewayRoutesApplication.class, args);
  }
}
