package com.adammendak.jerseywebservice.rest.service;

import com.adammendak.jerseywebservice.rest.exception.CustomExceptionDTO;
import com.adammendak.jerseywebservice.rest.exception.ExceptionMessages;
import com.adammendak.jerseywebservice.rest.model.User;
import com.adammendak.jerseywebservice.rest.model.dto.UserRequestDto;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.ManagedBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Named;


@Stateless
public class UserServiceImpl implements UserService{

    @Override
    public User createUser(UserRequestDto requestDto) {

        User newUser = new User();

        try {
            validateRequiredFields(requestDto);
        } catch (CustomExceptionDTO e) {

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

    public void validateRequiredFields (UserRequestDto userRequestDto) throws CustomExceptionDTO {
        if(userRequestDto.getFirstname() == null||
                userRequestDto.getFirstname().isEmpty() ||
                userRequestDto.getLastname() == null ||
                userRequestDto.getLastname().isEmpty() ||
                userRequestDto.getEmail() == null ||
                userRequestDto.getEmail().isEmpty() ||
                userRequestDto.getPassword() == null ||
                userRequestDto.getPassword().isEmpty()
                ) {
//            throw new CustomExceptionDTO(ExceptionMessages.MISSING_REQUIRED_FIELD.getErrorMessage(), ExceptionMessages.MISSING_REQUIRED_FIELD.getStatus());
            throw new CustomExceptionDTO(ExceptionMessages.ErrorMessagesFactory("MISSING_REQUIRED_FIELD"));
        }
    }
}
