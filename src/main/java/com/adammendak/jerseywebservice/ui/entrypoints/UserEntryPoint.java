package com.adammendak.jerseywebservice.ui.entrypoints;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/user")
public class UserEntryPoint {

    @POST
    public void createUser() {
        return;
    }

}
