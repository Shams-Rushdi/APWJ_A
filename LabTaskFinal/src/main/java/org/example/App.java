package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        //Exam mid = applicationContext.getBean("mid", Exam.class);
        //System.out.println(mid.methodA());

        Exam fin = applicationContext.getBean("final", Exam.class);
        System.out.println(fin.methodA());
    }
}
