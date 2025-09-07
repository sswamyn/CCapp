package com.usb.demo.controllers;

import com.usb.demo.aspects.Timed;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CCController {

    //@Timed(description = "Hello page rendering")
    //
    @GetMapping("/hello")
    public String sayHello(@RequestParam(defaultValue = "World") String name,
                           Model model) {
        System.out.println("**********************Hello " + name);
        model.addAttribute("user", name);

        // Simulate some processing time for demonstration
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return "welcome"; // returns the view name "welcome"

    }
}
