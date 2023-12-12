package com.furenqiang.starter.robot.controller;

import com.furenqiang.starter.robot.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lfy
 * @Description
 * @create 2023-04-27 20:02
 */
@RestController
public class RobotController {

    @Autowired
    RobotService robotService;

    @GetMapping("/robot/hello")
    public String sayHello() {
        String s = robotService.sayHello();
        return s;
    }
}
