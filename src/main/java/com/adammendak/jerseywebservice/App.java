package com.adammendak.jerseywebservice;

import com.adammendak.jerseywebservice.rest.service.UserServiceImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
//Application//
@ApplicationPath("api")
public class App extends Application {

}

//public class App extends ResourceConfig {
//
//    public App() {
//
//        // where the TestResource class is
//        packages("com.adammendak.jerseywebservice");
//
//        register(new AbstractBinder() {
//            @Override
//            protected void configure() {
//                bind(new UserServiceImpl()).to(UserServiceImpl.class);
//            }
//        });
//    }
//}