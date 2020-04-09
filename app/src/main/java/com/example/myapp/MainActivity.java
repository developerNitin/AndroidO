package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
    EditText passworEditText = (EditText) findViewById(R.id.passwordEditText);

    public void buttonClicked(View view) {
        Log.i("info", nameEditText.getText().toString());
        Log.i("passord", passworEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
