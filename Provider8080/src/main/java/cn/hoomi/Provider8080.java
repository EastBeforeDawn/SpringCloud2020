package cn.hoomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Hoomi_sunjin
 * @Date: 2020/8/1 20:09
 * @Description:
 */

@SpringBootApplication
@EnableEurekaClient
public class Provider8080 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8080.class,args);
    }
}
