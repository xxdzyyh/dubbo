package com.feng.eureka;

import com.feng.interfaces.IAppService;
import org.apache.dubbo.config.annotation.Service;

@Service(timeout = 5000)
public class AppService implements IAppService {

    @Override
    public String appInfos() {
       return "common.AppService.getApp()";
    }
}
