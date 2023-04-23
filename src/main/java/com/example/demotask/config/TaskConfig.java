package com.example.demotask.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.task.configuration.DefaultTaskConfigurer;
import org.springframework.cloud.task.configuration.TaskConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TaskConfig {
    /**
     * TaskConfig configure database for task tables,
     * Initializes the DefaultTaskConfigurer and sets the default table prefix to TaskProperties.DEFAULT_TABLE_PREFIX.
     * if you don't need the records in the database, send without DataSource in the DefaultTaskConfigurer parameter  new DefaultTaskConfigurer();
     */
    @Autowired
    DataSource dataSourceTask;

    @Bean
    public TaskConfigurer taskConfigurer() {
        return new DefaultTaskConfigurer(dataSourceTask);
    }
}
