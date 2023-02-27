package com.example.demo.config.msusercoreclient;


import com.example.demo.client.msusercore.exception.MsUserCoreExceptionDecoder;
import feign.Logger;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class MsUserCoreClientFeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
    @Bean
    ErrorDecoder feignErrorDecoder() {
        return new MsUserCoreExceptionDecoder();
    }

}
