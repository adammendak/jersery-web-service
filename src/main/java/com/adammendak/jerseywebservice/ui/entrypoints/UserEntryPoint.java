package com.adammendak.jerseywebservice.ui.entrypoints;

import com.adammendak.jerseywebservice.ui.dto.UserDto;
import com.adammendak.jerseywebservice.ui.dto.UserResponseDto;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserEntryPoint {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public UserResponseDto createUser(UserDto request) {

        UserResponseDto userDto = new UserResponseDto();
        return userDto;

    }

}
