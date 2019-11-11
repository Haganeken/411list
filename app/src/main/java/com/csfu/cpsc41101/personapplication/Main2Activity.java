//Ken Tat
//CPSC411 Assignment 2 parts 1+2
//CWID:390378789

package com.csfu.cpsc41101.personapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.String;


import com.csfu.cpsc41101.personapplication.model.CourseEnrollment;
import com.csfu.cpsc41101.personapplication.model.Person;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    public static final String student = "com.csfu.cpsc41101.personapplication";
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });
    }
    public void openMain() {
        //get values in edittext
        EditText fname = (EditText) findViewById(R.id.userFname);
        string mfname = fname.getText().toString();
        EditText lname = (EditText) findViewById(R.id.userLname);
        string mlname = lname.getText().toString();
        EditText cwid = (EditText) findViewById(R.id.userCWID);
        string mcwid = cwid.getText().toString();
        EditText classid = (EditText) findViewById(R.id.userCID);
        string mclassid = classid.getText().toString();
        EditText grade = (EditText) findViewById(R.id.userGrade);
        string mgrade = grade.getText().toString();

// Create Another Person
        //Person person = new Person(mfname, mlname, mcwid);


        //sets button to go back to main page after submitting
        Intent intent = new Intent(this, SummaryLVActivity.class);


/*
        Person p = new Person("Bob", "Jim");
        ArrayList<CourseEnrollment> CourseEnrollments = new ArrayList<CourseEnrollment>();
        CourseEnrollments.add(new CourseEnrollment("CPSC411", "C"));
        p.setCourseEnrollments(CourseEnrollments);
        mPeople = new ArrayList<Person>();
        mPeople.add(p);
 */
        //insert into Person DB
        /*
        --insert via attempt test prototypes

        intent.putExtra(student, fname);
        intent.putExtra(student, lname);
        intent.putExtra(student, cwid);
        intent.putExtra(student, classid);
        intent.putExtra(student, grade);
        */


        /*
        --db prototype test insertion
        Log.d(tag:"Text", fname + lname + cwid + classid + grade)
        Person person = new Person(fname,lname,cwid,classid,grade);
        db.addPersonObject(person)
         */



        startActivity(intent);


    }
}
