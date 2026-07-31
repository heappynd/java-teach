package com.yourname.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Map<String, String> hello() {
        System.out.println("11");
        return Map.of("messagge", "xx");
    }

    @GetMapping("/greet")
    public Map greet(@RequestParam(defaultValue = "World1") String name) {
        System.out.println(name);
        return Map.of("meessage", "Hello," + name + "!");
    }

    @PostMapping("/echo")
    public Map echo(@RequestBody String body) {
        return Map.of("received", body);
    }

    @GetMapping("/hello/{id}")
    public String getUser(@PathVariable Long id) {
        return "1";
    }
}
