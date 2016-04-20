package com.trons.Error;

import com.trons.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by trons on 16-4-21.
 */
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(TestError.class)
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    Map handle(TestError error){
        Response response = new Response();
        //TODO Response对象转换Map aop去除空属性
        return new HashMap<>();
    }
}
