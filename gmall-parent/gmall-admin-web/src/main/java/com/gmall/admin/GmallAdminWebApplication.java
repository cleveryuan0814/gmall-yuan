package com.gmall.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

/*
exclude = {DataSourceAutoConfiguration.class}
不进行数据源的自动配置
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@CrossOrigin
public class GmallAdminWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallAdminWebApplication.class, args);
    }

}
