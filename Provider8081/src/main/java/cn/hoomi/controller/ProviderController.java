package cn.hoomi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：sunjin
 * @date ：2020/8/2 2:45 下午
 * @description：提供者
 */

@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;
    @RequestMapping("/provider")
    public String  provider(){
        return "hello---" + port;
    }
}
