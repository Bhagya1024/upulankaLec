package com.example.tipcal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipCal = new TipCal(newtip:0f, newamount:0f);
    }

    public void calculate(View v)
    {
        EditText ebill=(EditText)findViewById(R.id.ebill);
        EditText etip=(EditText)findViewById(R.id.etip);

        String billstring=ebill.getText().toString();
        String tipstring=etip.getText().toString();

        TextView billtext=(TextView)findViewById(R.id.bill);
        TextView tiptext=(TextView)findViewById(R.id.tip);



    }

   try
    {
        float billvalue=Float.parseFloat(billstring);
        int tipValue=Integer
    }
}