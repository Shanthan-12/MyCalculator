package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnSub,btnMulti,btnDiv,btnEquals,btnDot;
Button btnClear;
EditText ed1;
float Res1, Res2;
boolean Add,Sub,Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMulti=(Button)findViewById(R.id.btnMulti);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnEquals=(Button)findViewById(R.id.btnEquals);
        btnDot=(Button)findViewById(R.id.btnDot);
        btnClear=(Button)findViewById(R.id.btnClear);
        ed1=(EditText) findViewById(R.id.editTextTextPersonName);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v)     {
                    ed1.setText(ed1.getText()+"1");
        }
    });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)     {
                ed1.setText(ed1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)     {
                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)     {
                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)     {
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)     {
                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)     {
                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)     {
                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)     {
                ed1.setText(ed1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)     {
                ed1.setText(ed1.getText()+"0");
            });
        });
        btnDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)     {
                ed1.setText(ed1.getText()+".");
            }
        });
}