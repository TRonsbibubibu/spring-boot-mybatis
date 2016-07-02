package com.trons.Error;

import com.trons.entity.Response;
import com.trons.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * Created by trons on 16-4-21.
 */
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    User handle(TestError error){
        Response response = new Response();
        User user = new User();
        user.setPassword("1231");
        return user;
    }
}
