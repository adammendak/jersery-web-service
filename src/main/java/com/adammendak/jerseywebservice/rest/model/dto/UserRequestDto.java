package com.adammendak.jerseywebservice.rest.model.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@XmlRootElement
public class UserRequestDto  implements Serializable {

    private String firstname;
    private String lastname;
    private String email;
    private String password;

}
