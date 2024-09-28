package com.disha.main;

import org.springframework.context.ApplicationContext;
import com.disha.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.disha.beans.Student;


public class App {
       public static void main(String [] args) {
    	   ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
    	   Student student = container.getBean(Student.class);
    	   student.display();
       }
        
}
