package com.ARDE.MMD.IMMS.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "IMMS_LOGIN")
@Data
public class LoginEntity {

    @Id
    @Column(name = "LOGIN_ID")
    private Long loginId;

    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    private RegistrationEntity user;

    @Column(name = "PASSWORD")
    private String password;
}
