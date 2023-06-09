package com.properties.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class EnvironmentInterface {

    @Autowired
    private Environment environment;

    public String getValueFromEnvironmentInterface() {
        return environment.getProperty("valueFromEnvironmentInterface");
    }
}
