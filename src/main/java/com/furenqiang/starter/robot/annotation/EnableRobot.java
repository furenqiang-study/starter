package com.furenqiang.starter.robot.annotation;

import com.furenqiang.starter.robot.RobotAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author Eric
 * @Description 自定义EnableRobot，别的项目直接在启动类上加上@EnableRobot注解即可使用，
 * 不再手动 @Import(com.furenqiang.starter.robot.RobotAutoConfiguration.class)
 * @Date 2023/12/12
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(RobotAutoConfiguration.class)
public @interface EnableRobot {
}
