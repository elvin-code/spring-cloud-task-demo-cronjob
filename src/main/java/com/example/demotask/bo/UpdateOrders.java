package com.example.demotask.bo;

import java.util.Date;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.demotask.config.TaskListener;
import com.example.demotask.exceptions.General;

@Log4j2
@Component
public class UpdateOrders  {

    public void executeTask() throws General {
        log.info("Start of delay: "+ new Date());
        log.info("Doing stuff ...");
        log.info("End of delay: "+ new Date());
    }

    @Bean
    public TaskListener taskListener() {
        return new TaskListener();
    }
}