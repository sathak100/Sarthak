package com.ARDE.MMD.IMMS.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ARDE.MMD.IMMS.Entity.RegistrationEntity;

@Repository
public interface RegistrationDao extends JpaRepository<RegistrationEntity,Integer> {
    RegistrationEntity findByUsername(String username);
    List<RegistrationEntity> findByRoleIgnoreCase(String role);
}
