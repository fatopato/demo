package com.suprema.idenfit.demo;

import com.supremainc.BS_SDK_V2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("hello babe");
        System.out.println(BS_SDK_V2.BS2_Version());
    }



    static {
        System.loadLibrary("BS_SDK_V2_wrap");
    }
}
