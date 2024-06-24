package com.example.ex21environment_variables02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
public class Controller {

    @Autowired
    private Environment environment;

    @GetMapping
    public String getProperty() {
        return environment.getProperty("VarTree.welcomeMsg");
    }
}
