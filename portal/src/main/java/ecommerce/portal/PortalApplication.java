package ecommerce.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "ecommerce")
public class PortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class,args);
    }
}
