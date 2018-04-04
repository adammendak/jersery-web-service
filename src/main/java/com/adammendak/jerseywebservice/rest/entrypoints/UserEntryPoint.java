package com.adammendak.jerseywebservice.rest.entrypoints;

import com.adammendak.jerseywebservice.rest.model.User;
import com.adammendak.jerseywebservice.rest.model.dto.UserRequestDto;
import com.adammendak.jerseywebservice.rest.model.dto.UserResponseDto;
import com.adammendak.jerseywebservice.rest.service.UserService;
import org.springframework.beans.BeanUtils;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserEntryPoint {

    @Inject
    UserService userService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public UserResponseDto createUser(UserRequestDto request) {

        //create User from request
        User newUser = userService.createUser(request);

        //create User Response
        UserResponseDto userResponseDto = new UserResponseDto();
        BeanUtils.copyProperties(newUser, userResponseDto);

        return userResponseDto;

    }

}
