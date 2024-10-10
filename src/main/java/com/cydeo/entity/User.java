package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor

public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private boolean enabled;
    private String phone;
    private Role role;
    private Gender gender;

    public User(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdateDateTime, Long lastUpdateUserID, boolean enabled, String firstName, Gender gender, String lastName, String passWord, String phone, Role role, String userName) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserID);
        this.enabled = enabled;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.passWord = passWord;
        this.phone = phone;
        this.role = role;
        this.userName = userName;
    }
}
