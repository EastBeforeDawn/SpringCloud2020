package cn.hoomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Hoomi_sunjin
 * @Date: 2020/8/1 19:36
 * @Description:
 */

@SpringBootApplication
@EnableEurekaServer
public class Eureka8000 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka8000.class,args);

    }
}
