package com.adammendak.jerseywebservice.rest.entrypoints;

import com.adammendak.jerseywebservice.rest.exception.CustomExceptionDTO;
import com.adammendak.jerseywebservice.rest.exception.ExceptionMessages;
import com.adammendak.jerseywebservice.rest.model.User;
import com.adammendak.jerseywebservice.rest.model.dto.UserRequestDto;
import com.adammendak.jerseywebservice.rest.model.dto.UserResponseDto;
import com.adammendak.jerseywebservice.rest.service.UserService;
import com.adammendak.jerseywebservice.rest.service.UserServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserEntryPoint {

//    @Inject
//    private UserServiceImpl userService;

//    @Inject
//    public UserEntryPoint(UserServiceImpl userService) {
//        this.userService = new UserServiceImpl();
//    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UserResponseDto createUser(UserRequestDto request) throws CustomExceptionDTO{

        //create User from request
        UserService userService = new UserServiceImpl();
        User newUser = userService.createUser(request);

        //create User Response
        UserResponseDto userResponseDto = new UserResponseDto();

//        BeanUtils.copyProperties(newUser, userResponseDto);

//        throw new CustomExceptionDTO(ExceptionMessages.ErrorMessagesFactory("MISSING_REQUIRED_FIELD"));
        throw new CustomExceptionDTO(ExceptionMessages.ErrorMessagesFactory("GENERIC_EXCEPTION"));

//        return userResponseDto;

    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "test";
    }
}


