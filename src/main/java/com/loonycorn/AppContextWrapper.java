package com.loonycorn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppContextWrapper {

    private static ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

    private AppContextWrapper(){}

    public static ApplicationContext getContext(){
        return context;
    }
}
