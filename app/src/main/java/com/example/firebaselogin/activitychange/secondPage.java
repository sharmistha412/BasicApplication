package com.example.firebaselogin.activitychange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondPage extends AppCompatActivity {

    Button b2;
    TextView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        b2=(Button)findViewById(R.id.button2);
        t3=(TextView)findViewById(R.id.text3);
        Bundle extra=getIntent().getExtras();
        if(extra!=null){
            String a=extra.getString("abc");
            t3.setText(a);
        }
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //code to go back to first
                Intent returnIntent=getIntent();
                returnIntent.putExtra("return","From Second Activity we are back");
                returnIntent.putExtra("p","hihi");
                setResult(RESULT_OK,returnIntent);
                finish();
            }
        });
    }
}