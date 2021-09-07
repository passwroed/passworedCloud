package cn.passwored.service.user.service.impl;

import cn.passwored.listener.BaseContextListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Project：cpc_build
 * Description：纪检系统启动应用类
 * Date：2021/4/6 16:09
 * Author wangke
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceUserApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ServiceUserApplication.class);
        application.addListeners(new BaseContextListener());
        application.run(args);

    }
}
