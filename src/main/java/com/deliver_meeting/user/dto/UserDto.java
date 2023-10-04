package com.deliver_meeting.user.dto;

import com.deliver_meeting.user.entity.UserType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

public class UserDto {
    private UserType userType; // 회원 유형

    private String email; // 이메일

    private String username; // 이름

    private String nickname; // 닉네임

    private LocalDate birthday; // 생년월일
}
