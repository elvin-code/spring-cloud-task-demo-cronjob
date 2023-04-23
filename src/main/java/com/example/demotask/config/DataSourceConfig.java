package com.example.demotask.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.log4j.Log4j2;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@Log4j2
public class DataSourceConfig {

    @Autowired
    private ServiceConfig serviceConfig;

    private HikariConfig solicitudConfig(String url) {
        var hikari = new HikariConfig();
        hikari.setJdbcUrl(url);
        return hikari;
    }

    @Primary
    @Bean(name = "conTaskdb")
    public  DataSource dataSourceTask() {
        HikariDataSource datasource = null;
        try{
            datasource = new HikariDataSource(solicitudConfig(serviceConfig.getConTaskdb() ));
        }catch (Exception e) {
            log.error("Error to connect a BD.", e);
            e.printStackTrace();
        }
        return datasource;
    }

}