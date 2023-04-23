package com.example.demotask.config;

import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;
import lombok.extern.log4j.Log4j2;
@Log4j2
public class TaskListener implements TaskExecutionListener {

    @Override
    public void onTaskEnd(TaskExecution arg0) {
        log.info("> onTaskEnd: " + arg0.getTaskName() + " Execution Id: " + arg0.getExecutionId());
    }

    @Override
    public void onTaskFailed(TaskExecution arg0, Throwable arg1) {
        log.error("> onTaskFailed: " + arg0.getTaskName() + " Execution Id: " + arg0.getExecutionId()
                + " Message: " +  arg1.getMessage());
    }

    @Override
    public void onTaskStartup(TaskExecution arg0) {
        log.info("> onTaskStartup: " + arg0.getTaskName() + " Execution Id: " + arg0.getExecutionId());
    }
}