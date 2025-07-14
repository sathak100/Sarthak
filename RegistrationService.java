package com.ARDE.MMD.IMMS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ARDE.MMD.IMMS.Dao.RegistrationDao;
import com.ARDE.MMD.IMMS.Entity.RegistrationEntity;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationDao registrationDao;  

    public RegistrationEntity registerUser(RegistrationEntity user) {
        return registrationDao.save(user);  
    }

    public List<RegistrationEntity> getAllUsers() {
        return registrationDao.findAll(); 
    }

    public List<RegistrationEntity> getUsersByRole(String role) {
        return registrationDao.findByRoleIgnoreCase(role); 
    }
}
