package com.example.junaid.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;

public class Beverages extends AppCompatActivity  {
        EditText ed,ed2;
        String ss,ss1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);
        ed=(EditText) findViewById(R.id.ed1);
        ed2=(EditText) findViewById(R.id.ed2);
        ss=getIntent().getExtras().getString("value");
        ss1=getIntent().getExtras().getString("valu");
        ed.setText(ss);
        ed2.setText(ss1);
    }
}
