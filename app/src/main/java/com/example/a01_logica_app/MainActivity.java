package com.example.a01_logica_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mInput1;
    private EditText mInput2;
    private EditText mInput3;
    private EditText mInput4;

    private Button mSubmitButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInput1 = findViewById(R.id.input1);
        mInput2 = findViewById(R.id.input2);
        mInput3 = findViewById(R.id.input3);
        mInput4 = findViewById(R.id.input4);

        mSubmitButton = findViewById(R.id.submitButton);
        mSubmitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                answerController();
            }
        });

    }

    public void answerController(){

        if (mInput1.getText().toString().equals("T")
                && mInput2.getText().toString().equals("F")
                && mInput3.getText().toString().equals("F")
                && mInput4.getText().toString().equals("F")) {
            Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
        }
        else Toast.makeText(MainActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
    }
}
