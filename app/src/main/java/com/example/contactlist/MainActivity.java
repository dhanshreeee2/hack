package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.contactlist.R;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button5;
    private Button button6;
    private Button button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1= (Button)findViewById(R.id.btn1);
        Button button5 = (Button)findViewById(R.id.btn5);
        Button button6= (Button)findViewById(R.id.btn6);
        Button button7= (Button)findViewById(R.id.btn7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
       
    }
    public void openActivity2(){
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent= new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void openActivity7(){
        Intent intent= new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void openActivity6(){
        Intent intent= new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    
}
