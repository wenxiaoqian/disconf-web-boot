package com.github.knightliao.disconf.web.api;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by knightliao on 16/6/22.
 * <p/>
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {

        return "index";
    }

}
