package com.example.shan.sharedpreferencesdemoit;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void readPref(View view) {
        SharedPreferences sharedPreferences =
                this.getPreferences(MODE_PRIVATE);


        String uname = sharedPreferences.getString("username",
                "not set");


        Toast.makeText(this,
                uname,
                Toast.LENGTH_LONG).show();
    }

    public void readSharedPref(View view) {
        SharedPreferences sharedPreferences =
                this.getSharedPreferences("session"
                        , MODE_PRIVATE);


        String uname = sharedPreferences.getString("username",
                "not set");


        Toast.makeText(this,
                uname,
                Toast.LENGTH_LONG).show();
    }
}
