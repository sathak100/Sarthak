package com.ARDE.MMD.IMMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ARDE.MMD.IMMS.Entity.LoginEntity;
import com.ARDE.MMD.IMMS.Service.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public String login(@RequestBody LoginEntity loginInput) {
        return loginService.login(loginInput);
    }
}
