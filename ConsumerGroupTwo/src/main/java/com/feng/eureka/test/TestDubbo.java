package com.feng.eureka.test;

import com.feng.interfaces.IAppService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestDubbo {

    @Reference
    private IAppService appService;

    @PostConstruct
    public void init() {
        String info = appService.appInfos();
        System.out.println(info);
    }
}
