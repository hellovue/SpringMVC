package org.github.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = applicationContext.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
