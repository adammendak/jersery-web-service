package com.adammendak.jerseywebservice.rest.entrypoints;

import com.adammendak.jerseywebservice.rest.exception.CustomExceptionDTO;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<CustomExceptionDTO> {

    @Override
    public Response toResponse(CustomExceptionDTO customExceptionDTO) {
        return Response.status(customExceptionDTO.getStatus()).entity(customExceptionDTO.toString()).build();
    }
}
