package com.adammendak.jerseywebservice.rest.service;

import com.adammendak.jerseywebservice.rest.model.User;
import com.adammendak.jerseywebservice.rest.model.dto.UserRequestDto;

import javax.inject.Qualifier;


public interface UserService {

    User createUser(UserRequestDto requestDto);
}
