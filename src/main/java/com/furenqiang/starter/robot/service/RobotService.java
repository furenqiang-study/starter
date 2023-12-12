package com.furenqiang.starter.robot.service;

import com.furenqiang.starter.robot.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lfy
 * @Description
 * @create 2023-04-27 19:58
 */
@Service
public class RobotService {

    @Autowired
    RobotProperties robotProperties;

    public String sayHello() {
        return "你好：名字：【" + robotProperties.getName() + "】;年龄：【" + robotProperties.getAge() + "】" + "[邮箱]：" + robotProperties.getEmail();
    }
}
