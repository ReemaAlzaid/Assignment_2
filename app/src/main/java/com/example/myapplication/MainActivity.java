package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle saved){
        super.onCreate(saved);
        setContentView(R.layout.activity_main);
    }
    public void Viewmessage(View view) {
        //to hide the keyboard when SUBMIT is pressed
        InputMethodManager input = (InputMethodManager) getSystemService(MainActivity.INPUT_METHOD_SERVICE);
        input.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = "Hello, "+(editText.getText().toString());
        TextView textView= findViewById(R.id.textView);
        textView.setText(message);
    }
}