package com.adammendak.jerseywebservice;

import com.adammendak.jerseywebservice.rest.service.UserServiceImpl;
import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationResource extends ResourceConfig {

    public ApplicationResource() {
        register(UserServiceImpl.class);
    }
}
