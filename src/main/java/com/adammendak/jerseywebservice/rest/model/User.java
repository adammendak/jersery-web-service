package com.adammendak.jerseywebservice.rest.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class User {

    private String userId;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

}
