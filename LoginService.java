package com.ARDE.MMD.IMMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ARDE.MMD.IMMS.Dao.LoginDao;
import com.ARDE.MMD.IMMS.Dao.RegistrationDao;
import com.ARDE.MMD.IMMS.Entity.LoginEntity;
import com.ARDE.MMD.IMMS.Entity.RegistrationEntity;

@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    @Autowired
    private RegistrationDao registrationDao;

    public String login(LoginEntity loginInput) {
        RegistrationEntity user = registrationDao.findByUsername(loginInput.getUser().getUsername());

        if (user != null && user.getPassword().equals(loginInput.getPassword())) {
            loginInput.setUser(user); // attach full user entity
            loginDao.save(loginInput);
            return "Login successful and saved in IMMS_LOGIN.";
        } else {
            return "Invalid username or password.";
        }
    }
}
