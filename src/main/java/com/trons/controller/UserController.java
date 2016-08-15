package com.trons.controller;


import com.trons.common.Response;
import com.trons.common.Validator;
import com.trons.dto.request.impl.UserLoginRequest;
import com.trons.dto.response.impl.UserLoginResponse;
import com.trons.exception.BadRequestException;
import com.trons.exception.BaseException;
import com.trons.facade.UserFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by trons on 16-4-17.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserFacade userFacade;

    @ResponseBody
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public Response getUserInfo(@RequestBody @Valid UserLoginRequest request) throws BaseException {
        String client = request.getClient();
        /**
         * 验证设备类型
         */
        if(!Validator.validatorClient(client))
            throw new BadRequestException();

        UserLoginResponse response = userFacade.userLogin(
                request.getStuCode(),
                request.getPassword(),
                client);
        return new Response(0, response);
    }
}
