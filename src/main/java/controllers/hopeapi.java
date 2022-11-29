package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/hope")
public class hopeapi {
    @GetMapping
    public String home() {
        return "Hopeful World!";
    }

}
