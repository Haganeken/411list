package com.csfu.cpsc41101.personapplication.model;

import java.util.ArrayList;

public class Person {
    protected String mFirstName;
    protected String mLastName;
    protected ArrayList<CourseEnrollment> mCWID;

    public Person(String fName, String lName) {
        mFirstName = fName;
        mLastName = lName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public ArrayList<CourseEnrollment> getCourseEnrollments() {
        return mCWID;
    }

    public void setCourseEnrollments(ArrayList<CourseEnrollment> CourseEnrollments) {
        mCWID = CourseEnrollments;
    }
}
