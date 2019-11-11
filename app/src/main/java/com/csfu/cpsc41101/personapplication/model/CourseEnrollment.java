package com.csfu.cpsc41101.personapplication.model;

public class CourseEnrollment {
    protected String courseID;
    protected String mGrade;


    public CourseEnrollment(String cID, String grade) {
        courseID = cID;
        mGrade = grade;

    }

    public String getcID() {
        return courseID;
    }

    public void setcID(String cID) {
        courseID = cID;
    }

    public String getgrade() {
        return mGrade;
    }

    public void setgrade(String grade) {
        mGrade = grade;
    }

}