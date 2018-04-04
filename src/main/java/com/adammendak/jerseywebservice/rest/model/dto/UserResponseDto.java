package com.adammendak.jerseywebservice.rest.model.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@XmlRootElement
public class UserResponseDto implements Serializable {

    private String userId;
    private String firstname;
    private String lastname;
    private String email;
    private String href;

}
