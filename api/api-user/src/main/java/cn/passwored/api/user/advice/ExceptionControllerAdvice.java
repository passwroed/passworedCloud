package cn.passwored.api.user.advice;

import cn.passwored.commons.core.bean.ApiResponse;
import cn.passwored.commons.core.bean.ApiStatus;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class ExceptionControllerAdvice {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String error(Exception e) {
        log.error(e.getStackTrace().toString());
        return JSON.toJSONString(ApiResponse.buildMessageCode(e.getMessage(), ApiStatus.SC_INTERNAL_SERVER_ERROR));
    }
}
