package cn.hoomi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("PROVIDER")
public interface FeignService {

    @RequestMapping("/provider")
     String  provider();
}
