package cn.hoomi.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：sunjin
 * @date ：2020/8/2 3:03 下午
 * @description：配置
 */


@Configuration
public class RestConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate setRestTemplate(){
        return new RestTemplate();
    }
}
