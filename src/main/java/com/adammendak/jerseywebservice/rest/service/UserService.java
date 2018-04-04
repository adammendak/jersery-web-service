package com.adammendak.jerseywebservice.rest.service;

import com.adammendak.jerseywebservice.rest.model.User;
import com.adammendak.jerseywebservice.rest.model.dto.UserRequestDto;

public interface UserService {

    User createUser(UserRequestDto requestDto);
}
