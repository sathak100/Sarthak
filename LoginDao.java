package com.ARDE.MMD.IMMS.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ARDE.MMD.IMMS.Entity.LoginEntity;

public interface LoginDao extends JpaRepository<LoginEntity, Long> {
}
