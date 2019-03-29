package com.example.currencyconvet;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.id.input;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    float a;

    public Button but1;

    public void init(){
        but1=(Button) findViewById(R.id.button2);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tt = new Intent(MainActivity.this,second.class);
                startActivity(tt);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }




    void convertUsdToCedi()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText cedi =(EditText)findViewById(R.id.cedi);
        cedi.setInputType(InputType.TYPE_CLASS_NUMBER);

        double a=Integer.parseInt(usd.getText().toString());
        double result=a*5.15;
        cedi.setText(String.valueOf(result));

    }

    void convertCediToUsd()
    {  EditText usd= (EditText) findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  cedi=(EditText) findViewById(R.id.cedi);


        double a=Integer.parseInt(cedi.getText().toString());
        double result=a/5.15;
        usd.setText(String.valueOf(result));
    }

    public void click(View view)
    {
        convertUsdToCedi();
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(false);
    }

    public void reset(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2=(Button) findViewById(R.id.submit2);
        b2.setEnabled(true);
        EditText usd= (EditText) findViewById(R.id.usd);
        EditText  cedi= (EditText)findViewById(R.id.cedi);
        usd.setText("");
        cedi.setText("");

    }

    public void click2(View view)
    {
        Button b1=(Button) findViewById(R.id.submit);
        b1.setEnabled(false);
        convertCediToUsd();
    }


}


