package com.csfu.cpsc41101.personapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.csfu.cpsc41101.personapplication.model.Person;
import com.csfu.cpsc41101.personapplication.model.PersonDB;
import com.csfu.cpsc41101.personapplication.model.CourseEnrollment;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected LinearLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createPersonObjects();
        setContentView(R.layout.person_summary);

        root = findViewById(R.id.person_summary);

        ArrayList<Person> personList = PersonDB.getInstance().getPeople();
        for (int i=0; i<personList.size(); i++) {
            Person p = personList.get(i);
            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.person_row, root, false);
            TextView firstNameView = (TextView) row_view.findViewById(R.id.first_name);
            firstNameView.setText(p.getFirstName());
            TextView lastNameView = (TextView) row_view.findViewById(R.id.last_name);
            lastNameView.setText(p.getLastName());
            //
            root.addView(row_view);
        }
        //
        // findViewById(R.id.first_name);
    }

    protected void createPersonObjects() {
        // Create James Person object
        Person p = new Person("Kyle", "Karen");
        ArrayList<CourseEnrollment> CourseEnrollments = new ArrayList<CourseEnrollment>();
        CourseEnrollments.add(new CourseEnrollment("CPSC411", "C"));
        p.setCourseEnrollments(CourseEnrollments);
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(p);
        // Create Another Person
        p = new Person("Bob", "Michael");
        CourseEnrollments = new ArrayList<CourseEnrollment>();
        CourseEnrollments.add(new CourseEnrollment("CPSC440", "B"));
        p.setCourseEnrollments(CourseEnrollments);
        personList.add(p);
        //
        PersonDB.getInstance().setPeople(personList);
    }

}
