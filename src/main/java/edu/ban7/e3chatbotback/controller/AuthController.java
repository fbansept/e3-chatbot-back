package edu.ban7.e3chatbotback.controller;

import edu.ban7.e3chatbotback.model.AppUser;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody AppUser user) {
        return "ok";
    }

}
