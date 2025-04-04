package com.java.service;

public class DevOpsCourse implements ICourse {

    DevOpsCourse() {
        System.out.println("DevOps Course");
    }
    @Override
    public void getCourseName() {
        System.out.println("DevOps Course");
    }

    @Override
    public void getDuration() {
        System.out.println("Duration: 5 months");
    }

    @Override
    public void getPrice() {
        System.out.println("Price: $500");
    }

    @Override
    public void getRating() {
        System.out.println("Rating: 4.8/5");
    }

    @Override
    public void getDescription() {
        System.out.println("Description: Comprehensive DevOps course covering CI/CD, Docker, Kubernetes, etc.");
    }

    @Override
    public void getInstructorName() {
        System.out.println("Instructor: Alice Johnson");
    }

    @Override
    public void getCourseContent() {
        System.out.println("Content: DevOps Basics, CI/CD, Docker, Kubernetes, Monitoring, etc.");
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
