package com.csfu.cpsc41101.personapplication.model;

import java.util.ArrayList;

public class PersonDB {
    private static final PersonDB ourInstance = new PersonDB();

    protected ArrayList<Person> mPeople;

    static public PersonDB getInstance() {
        return ourInstance;
    }

    private PersonDB() {
        createPersonObjects();
    }

    public ArrayList<Person> getPeople() {
        return mPeople;
    }

    public void setPeople(ArrayList<Person> people) {
        mPeople = people;
    }


    protected void createPersonObjects() {
        // Create James Person object
        Person p = new Person("Bob", "Jim");
        ArrayList<CourseEnrollment> CourseEnrollments = new ArrayList<CourseEnrollment>();
        CourseEnrollments.add(new CourseEnrollment("CPSC411", "C"));
        p.setCourseEnrollments(CourseEnrollments);
        mPeople = new ArrayList<Person>();
        mPeople.add(p);
        // Create Another Person
        p = new Person("Kyle", "Karen");
        CourseEnrollments = new ArrayList<CourseEnrollment>();
        CourseEnrollments.add(new CourseEnrollment("CPSC440", "B"));
        p.setCourseEnrollments(CourseEnrollments);
        mPeople.add(p);
        //
        //PersonDB.getInstance().setPeople(personList);
    }

}
