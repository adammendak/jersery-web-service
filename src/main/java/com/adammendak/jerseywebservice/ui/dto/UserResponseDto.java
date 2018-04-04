package com.adammendak.jerseywebservice.ui.dto;

import lombok.Data;

@Data
public class UserResponseDto {

    private String userId;
    private String firstname;
    private String lastname;
    private String email;
    private String href;

}
