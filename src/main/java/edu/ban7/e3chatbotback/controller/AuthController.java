package edu.ban7.e3chatbotback.controller;

import edu.ban7.e3chatbotback.dao.AppUserDao;
import edu.ban7.e3chatbotback.model.AppUser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
public class AuthController {

    @Autowired
    protected AppUserDao appUserDao;

    @PostMapping("/sign-in")
    public String inscription(@RequestBody @Validated(AppUser.OnCreate.class) AppUser user) {

        appUserDao.save(user);

        return "ok";
    }

    @PostMapping("/login")
    public String login(@RequestBody @Valid AppUser user) {
        return "ok";
    }


}
