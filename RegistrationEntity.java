package com.ARDE.MMD.IMMS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "IMMS_REGISTRATION")
@Data
public class RegistrationEntity {

    @Id
    @Column(name = "USER_ID")
    private Integer  userId;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL_ID")
    private String emailId;

    @Column(name = "ROLE")
    private String role;
}
