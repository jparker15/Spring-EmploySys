package com.atsignJar.EmployeeSys;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class EmployeeController {

    private final AtomicLong counter = new AtomicLong();

    //root route || home route
    @GetMapping("/")
    public String getRoot(){
        return "Hello Employees!" +
                "\n \n \n \n All right, I've been thinking, when life gives you lemons, don't make lemonade! Make life take the lemons back! Get mad! I don't want your damn lemons! What am I supposed to do with these? Demand to see life's manager!\n" +
                "Make life rue the day it thought it could give Cave Johnson lemons! Do you know who I am? I'm the man whose gonna burn your house down - with the lemons!";
    }

    @GetMapping("/hello")
    public String

}
