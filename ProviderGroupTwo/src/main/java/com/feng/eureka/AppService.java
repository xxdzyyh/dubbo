package com.feng.eureka;

import com.feng.interfaces.IAppService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(group = "${dubbo.application.group}", timeout = 5000)
public class AppService implements IAppService {

//    @Value("${dubbo.application.group}")
//    String group;

    @Override
    public String appInfos() {
       return "Provider 1 AppService.getApp()";
    }
}
