package cn.hoomi.controller;

import cn.hoomi.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：sunjin
 * @date ：2020/8/2 3:02 下午
 * @description：消费者
 */

@RestController
public class ConsumerController {


    @Autowired
    private FeignService feignService;
    public static final String URL = "http://PROVIDER/provider";

    @RequestMapping("/consumer")
    public String consumer(){
        return  feignService.provider();
    }
}
