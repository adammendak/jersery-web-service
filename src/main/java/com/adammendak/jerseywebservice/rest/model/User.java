package com.adammendak.jerseywebservice.rest.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@XmlRootElement
@Entity (name = "Users")
public class User implements Serializable{


    @Id
    @GeneratedValue
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

}
