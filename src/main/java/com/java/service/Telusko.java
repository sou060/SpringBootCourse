package com.java.service;

public class Telusko {
    Telusko() {
        System.out.println("Telusko Course");

    }
  private ICourse iCourse;
public void setCourse(ICourse iCourse)
{
    this.iCourse = iCourse;
}
public boolean isCourseAvailable() {
    return iCourse != null;

}
public void getCourseName() {
    if (iCourse != null) {
        iCourse.getCourseName();
    } else {
        System.out.println("No course available");
    }
}
public void getDuration() {
    if (iCourse != null) {
        iCourse.getDuration();
    } else {
        System.out.println("No course available");
    }
}
public void getPrice() {
    if (iCourse != null) {
        iCourse.getPrice();
    } else {
        System.out.println("No course available");
    }
}
public void getRating() {
    if (iCourse != null) {
        iCourse.getRating();
    } else {
        System.out.println("No course available");
    }
}
public void getDescription() {
    if (iCourse != null) {
        iCourse.getDescription();
    } else {
        System.out.println("No course available");
    }
}
public void getInstructorName() {
    if (iCourse != null) {
        iCourse.getInstructorName();
    } else {
        System.out.println("No course available");
    }
}
public void getCourseContent() {
    if (iCourse != null) {
        iCourse.getCourseContent();
    } else {
        System.out.println("No course available");
    }
}
public void getCourseLevel() {
    if (iCourse != null) {
        iCourse.getCourseLevel();
    } else {
        System.out.println("No course available");
    }
}
public void getCourseLanguage() {
    if (iCourse != null) {
        iCourse.getCourseLanguage();
    } else {
        System.out.println("No course available");
    }
}
public void getCourseType() {
    if (iCourse != null) {
        iCourse.getCourseType();
    } else {
        System.out.println("No course available");
    }}

}
