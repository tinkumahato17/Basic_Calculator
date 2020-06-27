package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Calculate;
    TextView Add, Sub, Mul, Div;
    EditText number1, number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Calculate = (Button)findViewById(R.id.calculate);
        Add = (TextView)findViewById(R.id.Addition);
        Sub = (TextView)findViewById(R.id.subtraction);
        Mul = (TextView)findViewById(R.id.Multiplication);
        Div = (TextView)findViewById(R.id.Division);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(number1.getText().toString() != null & number2.getText().toString() != null){

                    int a=Integer.parseInt(number1.getText().toString());
                    int b=Integer.parseInt(number2.getText().toString());

                    int add = a+b;
                    int sub = a-b;
                    int mul = a*b;
                    int div = a/b;

                    Add.setText(Integer.toString(add));
                    Sub.setText(Integer.toString(sub));
                    Mul.setText(Integer.toString(mul));
                    Div.setText(Integer.toString(div));
                } else {
                    Toast.makeText(MainActivity.this, "Enter this number",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
