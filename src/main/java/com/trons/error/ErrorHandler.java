package com.trons.error;


import com.trons.common.Response;
import com.trons.exception.BadRequestException;
import com.trons.exception.BaseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
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
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ResponseBody
    public Response handle(BaseException error) {
        return new Response(error.getCode());
    }

    @ExceptionHandler({
            MethodArgumentNotValidException.class,
            MissingServletRequestParameterException.class,
            MissingPathVariableException.class,
            HttpMessageNotReadableException.class
    })
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ResponseBody
    public Response handleRequestBody(Throwable error) {
        return new Response(new BadRequestException().getCode());
    }
}
