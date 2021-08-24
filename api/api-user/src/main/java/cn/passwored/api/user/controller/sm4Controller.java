package cn.passwored.api.user.controller;

/**
 * Project：passworedCloud
 * Description：
 * Date：2021-08-25 01:51
 * Author wangke
 */

import cn.passwored.commons.core.bean.ApiResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Log4j2
@RequestMapping("/api/user/sm4")
public class sm4Controller {

    @PostMapping("/test")
    public ApiResponse<Object> test(@RequestBody Map<String, String> params) throws Exception {
        log.error("");
        throw new Exception();
    }
}
