package com.demo.Controllers;

import com.demo.Entity.Greetng;
import com.demo.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/greeting")
public class GreetingController {

    private static final String greetingTemplate = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/hello")
    public @ResponseBody
    Greetng helloGreeting(@RequestParam(name = "name", defaultValue = "World") String name){
        return new Greetng(counter.incrementAndGet(), String.format(greetingTemplate, name));
    }


}
