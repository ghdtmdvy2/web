package com.deliver_meeting.user.entity;

import com.deliver_meeting.config.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
@Setter
@Getter
public class Users extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserType userType; // 회원 유형

    @Column(length = 400, nullable = false, unique = true)
    private String email; // 이메일

    @Column
    private String password; // 패스워드

    @Column(length = 30, nullable = false, unique = true)
    private String username; // 이름

    @Column(length = 30, nullable = false, unique = true)
    private String nickname; // 닉네임

    private LocalDate birthday; // 생년월일
}
