package com.java.service;

public class JavaCourse implements ICourse {
    JavaCourse() {
        System.out.println("Java Course");
    }

    @Override
    public void getCourseName() {
        System.out.println("Java Course");
    }

    @Override
    public void getDuration() {
        System.out.println("Duration: 3 months");
    }

    @Override
    public void getPrice() {
        System.out.println("Price: $300");
    }

    @Override
    public void getRating() {
        System.out.println("Rating: 4.5/5");
    }

    @Override
    public void getDescription() {
        System.out.println("Description: Comprehensive Java course covering basics to advanced topics.");
    }

    @Override
    public void getInstructorName() {
        System.out.println("Instructor: John Doe");
    }

    @Override
    public void getCourseContent() {
        System.out.println("Content: Java Basics, OOP, Collections, Exception Handling, etc.");
    }

    @Override
    public void getCourseLevel() {
        System.out.println("Level: Intermediate");
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
