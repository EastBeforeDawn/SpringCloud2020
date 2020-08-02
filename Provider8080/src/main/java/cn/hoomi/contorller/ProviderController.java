package cn.hoomi.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

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
       /* try {
            TimeUnit.SECONDS.sleep(6);
        }catch (Exception e) {

        }*/

        return "hello---" + port;
    }
}
