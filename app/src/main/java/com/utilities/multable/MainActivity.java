package com.utilities.multable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView output;
    EditText inputNumber;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        output=findViewById(R.id.textView2);
        inputNumber=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number=Integer.parseInt(inputNumber.getText().toString());

               output.setText(printTable(number));
            }
        });
    }

    private String printTable(int number){
        String table="";
        for (int i=1;i<=10;i++){
            int res=number*i;
            table+=number+"\t"+"X"+"\t"+i+"\t"+"=\t"+res+"\n";
        }
        return table;
    }
}