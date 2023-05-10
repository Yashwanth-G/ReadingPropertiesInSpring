package com.properties;

import com.properties.beans.EnvironmentInterface;
import com.properties.beans.ValueAnnotation;
import com.properties.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        var v1 = context.getBean(ValueAnnotation.class);
        var v2 = context.getBean(EnvironmentInterface.class);
        System.out.println(v1.getValueUsingValueAnnotation());
        System.out.println(v2.getValueFromEnvironmentInterface());
    }
}
