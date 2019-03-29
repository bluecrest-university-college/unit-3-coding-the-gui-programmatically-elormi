package com.example.currencyconvet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Toast;


public class second extends AppCompatActivity {
   RadioGroup radioGroup;
   RadioButton radioButton;
   Button but1;
   Button but2;


    public void init(){
        but1=(Button)findViewById(R.id.button);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kk = new Intent(second.this, MainActivity.class);
                startActivity(kk);
            }
        }


        @Override
        protected void onCreate (Bundle savedInstanceState)
        second.super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_second);
                init();
            }
    }
