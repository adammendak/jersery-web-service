package com.adammendak.jerseywebservice.rest.service;

import com.adammendak.jerseywebservice.rest.exception.MissingRequiredFieldException;
import com.adammendak.jerseywebservice.rest.model.User;
import com.adammendak.jerseywebservice.rest.model.dto.UserRequestDto;

public class UserServiceImpl implements UserService{

    @Override
    public User createUser(UserRequestDto requestDto) {

        User newUser = new User();

        try {
            validateRequiredFields(requestDto);
        } catch (MissingRequiredFieldException e) {

        }

        //TODO check if user exists
        //TODO create an entity object
        //TODO generate secure public id
        //TODO generate salt
        //TODO generate secure password
        //TODO record data into database
        //TODO return back user

        return newUser;

    }

    public void validateRequiredFields (UserRequestDto userRequestDto) throws MissingRequiredFieldException {
        if(userRequestDto.getFirstname() == null||
                userRequestDto.getFirstname().isEmpty() ||
                userRequestDto.getLastname() == null ||
                userRequestDto.getLastname().isEmpty() ||
                userRequestDto.getEmail() == null ||
                userRequestDto.getEmail().isEmpty() ||
                userRequestDto.getPassword() == null ||
                userRequestDto.getPassword().isEmpty()
                ) {
            throw new MissingRequiredFieldException("missing required field");
        }
    }
}
