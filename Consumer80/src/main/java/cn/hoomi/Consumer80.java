package cn.hoomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：sunjin
 * @date ：2020/8/2 3:00 下午
 * @description：
 */

@SpringBootApplication
@EnableEurekaClient
public class Consumer80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80.class,args);
    }
}
