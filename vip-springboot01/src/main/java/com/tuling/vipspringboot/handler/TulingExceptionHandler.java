package com.tuling.vipspringboot.handler;

import com.tuling.vipspringboot.exception.TulingException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class TulingExceptionHandler {


    @ExceptionHandler(value = TulingException.class)
    @ResponseBody
    public String dealException(TulingException e, HttpServletRequest request){

        Map<String, Object> retInfo = new HashMap<>();
        retInfo.put("code",e.getCode());
        retInfo.put("msg",e.getMesg());

        request.setAttribute("javax.servlet.error.status_code",500);
        request.setAttribute("ext",retInfo);
        return "forward:/error";
    }
}
