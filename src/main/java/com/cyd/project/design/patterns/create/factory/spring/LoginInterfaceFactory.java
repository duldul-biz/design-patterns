package com.cyd.project.design.patterns.create.factory.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 10:30
 * @ClassName LoginInterfaceFactory
 * @Version: 1.0
 */
@Component
public class LoginInterfaceFactory implements ApplicationContextAware {

    @Autowired
    private static ApplicationContext applicationContext;

    private static Map<String,LoginInterface> cache = new HashMap<>(4);

    public static LoginInterface getyundaole(){
        return cache.computeIfAbsent("yundaole", LoginInterfaceFactory::new2);
    }

    public static LoginInterface getxiaochengxu(){
        return cache.computeIfAbsent("xiaochengxu", LoginInterfaceFactory::new2);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LoginInterfaceFactory.applicationContext = applicationContext;
    }

    public static synchronized LoginInterface new2(String beanName){
        if(beanName.equals("yundaole")){
            LinkManService linkManService = (LinkManService)applicationContext.getBean("linkManService");
            return new LoginInterface1(linkManService);
        }else {
            LinkManService linkManService = (LinkManService)applicationContext.getBean("linkManService");
            return new LoginInterface2(linkManService);
        }

    }
}
