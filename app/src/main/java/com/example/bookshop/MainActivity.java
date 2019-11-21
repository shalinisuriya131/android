package com.example.bookshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et1,et2,et3,et4;
String s1,s2,s3,s4;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editText);
        et3=findViewById(R.id.editText3);
        et4=findViewById(R.id.editText4);
        et2=findViewById(R.id.editText2);
        b1=findViewById(R.id.button);
        s1=et1.getText().toString();
        s2=et3.getText().toString();
        s3=et4.getText().toString();
        s4=et2.getText().toString();

    }
    public void send(View view)
    {

        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("name",s1);
        intent.putExtra("email",s2);
        intent.putExtra("city",s3);
        intent.putExtra("phone",s4);
        startActivity(intent);
    }
}
