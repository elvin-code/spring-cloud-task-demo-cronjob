package com.example.demotask.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demotask.bo.UpdateOrders;

@Component
public class TaskCommandLineRunner implements CommandLineRunner {
    @Autowired
    UpdateOrders updateOrders;

    @Override
    public void run(String... args) throws Exception {
        updateOrders.executeTask();
    }
}
