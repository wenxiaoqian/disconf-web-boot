package com.github.knightliao.support.demo;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;

@Controller
public class WelcomeController {

    @Data
    public class MyData {
        Date time;
        String message;

        public MyData(Date time, String message) {
            this.time = time;
            this.message = message;
        }
    }

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {

        MyData data = new MyData(new Date(), this.message);

        model.put("data", data);

        return "demo/welcome";
    }

}
