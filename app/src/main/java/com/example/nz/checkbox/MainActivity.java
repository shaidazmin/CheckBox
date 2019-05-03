package com.example.nz.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox checkBox1,checkBox2,checkBox3;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox) findViewById(R.id.box1);
        checkBox2 = (CheckBox) findViewById(R.id.box2);
        checkBox3 = (CheckBox) findViewById(R.id.box3);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.order);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        StringBuilder stringBuilder = new StringBuilder();
       if(checkBox1.isChecked()){
           String string1 = checkBox1.getText().toString();
           stringBuilder.append("You ordered : "+string1);
       }if(checkBox2.isChecked()){
            String string2 = checkBox2.getText().toString();
            stringBuilder.append("You ordered : "+string2);
        }if(checkBox3.isChecked()){
            String string3 = checkBox3.getText().toString();
            stringBuilder.append("You ordered : "+string3);
        }

        textView.setText(stringBuilder);




    }
}
