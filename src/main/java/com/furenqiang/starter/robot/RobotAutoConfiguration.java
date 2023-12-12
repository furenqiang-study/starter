package com.furenqiang.starter.robot;

import com.furenqiang.starter.robot.controller.RobotController;
import com.furenqiang.starter.robot.properties.RobotProperties;
import com.furenqiang.starter.robot.service.RobotService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({RobotController.class, RobotProperties.class, RobotService.class})
@Configuration
public class RobotAutoConfiguration {
}
