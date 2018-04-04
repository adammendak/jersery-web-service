package com.adammendak.jerseywebservice.rest.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class UserDto {

    private String firstname;
    private String lastname;
    private String email;
    private String password;



}
