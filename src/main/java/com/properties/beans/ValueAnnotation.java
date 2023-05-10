package com.properties.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:application.properties")
public class ValueAnnotation {

    @Value("${valueUsingValueAnnotation}")
    private String valueUsingValueAnnotation;

    public String getValueUsingValueAnnotation() {
        return valueUsingValueAnnotation;
    }

}
