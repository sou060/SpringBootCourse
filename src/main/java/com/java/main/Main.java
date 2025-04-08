package com.java.main;

import com.java.service.ICourse;
import com.java.service.Telusko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationconfig.xml");
        Telusko telusko = (Telusko) context.getBean("telusko");
        //telusko.setCourse((ICourse) context.getBean("springBootCourse")); In Xml the object is passing
        if (telusko.isCourseAvailable()) {
            System.out.println("Course is available");
            telusko.getCourseName();
            telusko.getDuration();
            telusko.getPrice();
            telusko.getRating();
            telusko.getDescription();
            telusko.getInstructorName();
            telusko.getCourseContent();
            telusko.getCourseLevel();
            telusko.getCourseLanguage();
            telusko.getCourseType();
        } else {
            System.out.println("No course available");
        }
    }
}
