package com.furenqiang.starter.robot.service;

import com.furenqiang.starter.robot.properties.RobotProperties;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lfy
 * @Description
 * @create 2023-04-27 19:58
 */
@Service
@Slf4j
public class RobotService {

    @Autowired
    RobotProperties robotProperties;

    Counter counter;

    public RobotService(MeterRegistry meterRegistry) {
        counter = meterRegistry.counter("访问次数");
    }

    public String sayHello() {
        log.info("执行了{}方法", "sayHello");
        counter.increment();
        return "你好：名字：【" + robotProperties.getName() + "】;年龄：【" + robotProperties.getAge() + "】" + "[邮箱]：" + robotProperties.getEmail();
    }
}
