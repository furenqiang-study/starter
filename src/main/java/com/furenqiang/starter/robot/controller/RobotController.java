package com.furenqiang.starter.robot.controller;

import com.furenqiang.starter.robot.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

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

//    @GetMapping("/robot/http")
//    public String http() {
//        //获取响应完整信息
//        WebClient client = WebClient.create("https://example.org");
//
//        Mono<ResponseEntity<Person>> result = client.get()
//                .uri("/persons/{id}", id).accept(MediaType.APPLICATION_JSON)
//                .retrieve()
//                .toEntity(Person.class);
//
////只获取body
//        WebClient client = WebClient.create("https://example.org");
//
//        Mono<Person> result = client.get()
//                .uri("/persons/{id}", id).accept(MediaType.APPLICATION_JSON)
//                .retrieve()
//                .bodyToMono(Person.class);
//
////stream数据
//        Flux<Quote> result = client.get()
//                .uri("/quotes").accept(MediaType.TEXT_EVENT_STREAM)
//                .retrieve()
//                .bodyToFlux(Quote.class);
//
////定义错误处理
//        Mono<Person> result = client.get()
//                .uri("/persons/{id}", id).accept(MediaType.APPLICATION_JSON)
//                .retrieve()
//                .onStatus(HttpStatus::is4xxClientError, response -> ...)
//        .onStatus(HttpStatus::is5xxServerError, response -> ...)
//        .bodyToMono(Person.class);
//    }
}
