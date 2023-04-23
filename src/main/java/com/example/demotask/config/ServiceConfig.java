package com.example.demotask.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import lombok.Getter;

@Configuration
public class ServiceConfig {

    @Value("${spring.datasource.taskdb}")
    @Getter
    private String conTaskdb;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public ServiceConfig getServiceConfig() {
        return new ServiceConfig();
    }

}