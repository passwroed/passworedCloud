package cn.passwored.api.user.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project：passworedCloud
 * Description：
 * Date：2021-08-25 03:11
 * Author wangke
 */
@ControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String error(Exception e) {
        e.printStackTrace();
        return "{}";
    }
}
