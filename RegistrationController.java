package com.ARDE.MMD.IMMS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ARDE.MMD.IMMS.Entity.RegistrationEntity;
import com.ARDE.MMD.IMMS.Service.RegistrationService;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/register")
    public RegistrationEntity register(@RequestBody RegistrationEntity user) {
        return registrationService.registerUser(user);
    }

    @GetMapping("/all")
    public List<RegistrationEntity> getAllUsers() {
        return registrationService.getAllUsers();
    }

    @GetMapping("/role/{role}")
    public List<RegistrationEntity> getUsersByRole(@PathVariable String role) {
        return registrationService.getUsersByRole(role);
    }
}
