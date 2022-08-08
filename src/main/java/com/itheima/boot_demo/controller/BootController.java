package com.itheima.boot_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookss")
public class BootController {
    @GetMapping("/{id}")
    public String m(@PathVariable Integer id) {
        System.out.println("id==" + id);
        return "good";
    }
}
