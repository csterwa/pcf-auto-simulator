package io.pivotal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class RepairServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepairServiceApplication.class, args);
    }

    @Bean
    public AlwaysSampler defaultSampler() {
      return new AlwaysSampler();
    }        
}
