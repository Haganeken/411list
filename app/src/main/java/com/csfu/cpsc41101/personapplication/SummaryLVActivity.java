package com.csfu.cpsc41101.personapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.view.View;

import com.csfu.cpsc41101.personapplication.R;
import com.csfu.cpsc41101.personapplication.adapter.SummaryLVAdapter;
import com.csfu.cpsc41101.personapplication.model.Person;
import com.csfu.cpsc41101.personapplication.model.PersonDB;
import com.csfu.cpsc41101.personapplication.model.CourseEnrollment;

import java.util.ArrayList;

public class SummaryLVActivity extends Activity {

    protected ListView mSummaryView;
    protected final String TAG = "Summary Screen";
    protected SummaryLVAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate() called");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sumary_listview);

        mSummaryView = findViewById(R.id.summary_list_view_id);
        ad = new SummaryLVAdapter();
        mSummaryView.setAdapter(ad);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2() {


        Intent intent = new Intent(this, Main2Activity.class);

        startActivity(intent);


    }


    @Override
    protected void onPause() {
        Log.d(TAG, "onPause() called");
        super.onPause();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart() called");
        ad.notifyDataSetChanged();
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop() called");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume() called");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy() called");
        super.onDestroy();
    }
}
