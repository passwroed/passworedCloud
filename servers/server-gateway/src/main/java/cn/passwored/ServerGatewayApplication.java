package cn.passwored;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Project：passworedCloud
 * Description：
 * Date：2021-08-25 01:02
 * Author wangke
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class ServerGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerGatewayApplication.class, args);
    }
}
