package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText  fvalue,svalue;
    TextView ans;
    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fvalue=findViewById(R.id.Fnum);
        svalue=findViewById(R.id.Snum);
        ans=findViewById(R.id.ans);
        add=findViewById(R.id.plus);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int f,s,a;
                f=Integer.parseInt(fvalue.getText().toString());
                s=Integer.parseInt(svalue.getText().toString());

                a=f+s;

                ans.setText("Ans is: "+a);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(fvalue.getText().toString());
                s=Integer.parseInt(svalue.getText().toString());
                a=f-s;
                ans.setText("Ans is: "+a);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(fvalue.getText().toString());
                s=Integer.parseInt(svalue.getText().toString());
                a=f*s;
                ans.setText("Ans is: "+a);
            }
        });
div.setOnClickListener(new View.OnClickListener() {
    @Override

    public void onClick(View v)
    {
        int f,s,a;
        f=Integer.parseInt(fvalue.getText().toString());
        s=Integer.parseInt(svalue.getText().toString());

        a=f/s;
        ans.setText("Ans is: "+a);

    }
        });

    }
}