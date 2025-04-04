package com.java.service;

public class SpringBootCourse implements ICourse {
    SpringBootCourse() {
        System.out.println("Spring Boot Course");
    }

    @Override
    public void getCourseName() {
        System.out.println("Spring Boot Course");
    }

    @Override
    public void getDuration() {
        System.out.println("Duration: 4 months");
    }

    @Override
    public void getPrice() {
        System.out.println("Price: $400");
    }

    @Override
    public void getRating() {
        System.out.println("Rating: 4.7/5");
    }

    @Override
    public void getDescription() {
        System.out.println("Description: Comprehensive Spring Boot course covering basics to advanced topics.");
    }

    @Override
    public void getInstructorName() {
        System.out.println("Instructor: Jane Smith");
    }

    @Override
    public void getCourseContent() {
        System.out.println("Content: Spring Boot Basics, REST APIs, Microservices, etc.");
    }

    @Override
    public void getCourseLevel() {
        System.out.println("Level: Advanced");
    }

    @Override
    public void getCourseLanguage() {
        System.out.println("Language: English");
    }

    @Override
    public void getCourseType() {
        System.out.println("Type: Online");
    }
}
