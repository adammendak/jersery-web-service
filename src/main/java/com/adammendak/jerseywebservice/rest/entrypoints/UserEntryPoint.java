package com.adammendak.jerseywebservice.rest.entrypoints;

import com.adammendak.jerseywebservice.rest.exception.CustomExceptionDTO;
import com.adammendak.jerseywebservice.rest.model.User;
import com.adammendak.jerseywebservice.rest.model.dto.UserRequestDto;
import com.adammendak.jerseywebservice.rest.model.dto.UserResponseDto;
import com.adammendak.jerseywebservice.rest.service.TestService;
import com.adammendak.jerseywebservice.rest.service.UserService;
import com.adammendak.jerseywebservice.rest.service.UserServiceAnno;
import com.adammendak.jerseywebservice.rest.service.UserServiceImpl;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserEntryPoint {

//    @Default
//    @Inject
//    @UserServiceAnno
//    private UserServiceImpl userService;

//    @Inject
//    public UserEntryPoint(UserServiceImpl userService) {
//        this.userService = new UserServiceImpl();
//    }

    @Inject
    private TestService testService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String createUser(UserRequestDto request) throws CustomExceptionDTO{

        //create User from request
//        UserServiceImpl userService = new UserServiceImpl();
//
//        User newUser = userService.createUser(request);
//        UserResponseDto userResponseDto = new UserResponseDto();
//        userResponseDto.setEmail("asdfasdf");

//        BeanUtils.copyProperties(newUser, userResponseDto);

//        throw new CustomExceptionDTO(ExceptionMessages.ErrorMessagesFactory("MISSING_REQUIRED_FIELD"));
//        throw new CustomExceptionDTO(ExceptionMessages.ErrorMessagesFactory("GENERIC_EXCEPTION"));

        return "Hello World";

    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "test";
    }
}


