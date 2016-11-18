package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {


    EditText et1, et2;
    Button button1, button2, button3, button4, button5;
    TextView textResult;
    int num1, num2;
    Integer Result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("계산기");

        et1 = (EditText) findViewById(R.id.editText);

        et2 = (EditText) findViewById(R.id.editText2);

        button1 = (Button) findViewById(R.id.button1);

        button2 = (Button) findViewById(R.id.button2);

        button3 = (Button) findViewById(R.id.button3);

        button4 = (Button) findViewById(R.id.button4);

        button5 = (Button) findViewById(R.id.button5);

        textResult = (TextView) findViewById(R.id.textView);

        View.OnClickListener clisten = new View.OnClickListener() {

            public void onClick(View v) {

                num1 = Integer.parseInt(et1.getText().toString());

                num2 = Integer.parseInt(et2.getText().toString());

                switch(v.getId()){

                    case R.id.button1 :

                        Result = num1 + num2;

                        break;

                    case R.id.button2 :

                        Result = num1 - num2;

                        break;

                    case R.id.button3:

                        Result = num1 * num2;

                        break;

                    case R.id.button4:

                        Result = num1 / num2;

                        break;
                    case R.id.button5:
                        Result=num1%num2;
                        break;
                }



                textResult.setText("계산결과 : "+Result);

            }

        };
        button1.setOnClickListener(clisten);

        button2.setOnClickListener(clisten);

        button3.setOnClickListener(clisten);

        button4.setOnClickListener(clisten);

        button5.setOnClickListener(clisten);

    }


}

