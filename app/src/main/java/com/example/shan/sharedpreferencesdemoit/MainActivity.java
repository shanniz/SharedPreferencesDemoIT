package com.example.shan.sharedpreferencesdemoit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    EditText mEditTextUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextUsername = (EditText)
                findViewById(R.id.editTextUsername);

    }

    public void savePref(View view) {

        SharedPreferences sharedPreferences =
                this.getPreferences(MODE_PRIVATE);

        SharedPreferences.Editor editor =
                sharedPreferences.edit();

        editor.putString("username",
                mEditTextUsername.getText().toString());

        editor.commit();

    }

    public void readPreferences(View view) {

        SharedPreferences sharedPreferences =
                this.getPreferences(MODE_PRIVATE);


        String uname = sharedPreferences.getString("username",
                "not set");


        Toast.makeText(this,
                uname,
                Toast.LENGTH_LONG).show();
    }

    public void saveSharedPref(View view) {
        SharedPreferences sharedPreferences =
                this.getSharedPreferences("session",
                        MODE_PRIVATE);

        SharedPreferences.Editor editor =
                sharedPreferences.edit();

        editor.putString("username",
                mEditTextUsername.getText().toString());

        editor.commit();
    }

    public void openSecondActivity(View view) {
        Intent intent = new Intent(MainActivity.this
        , SecondActivity.class);
        startActivity(intent);
    }
}
