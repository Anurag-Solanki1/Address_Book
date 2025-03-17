package com.example.AddressBook.DTO;

import com.example.AddressBook.Model.UserInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserInfoDTO  extends UserInfo {

    private String userName;

    private String lastName;
    private long phoneNumber;
    private String email;

}
