package com.example.bookshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Main2Activity extends AppCompatActivity {
CheckBox c2,c3,c4;
Button b2;
String str1,str2,str3,str4;
StringBuilder str=new StringBuilder();
StringBuilder strb=new StringBuilder();
String book;
int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);
        b2=findViewById(R.id.button2);
        Intent i=getIntent();
        str1=i.getStringExtra("name");
        str2=i.getStringExtra("email");
        str3=i.getStringExtra("city");
        str4=i.getStringExtra("phone");
        if(c2.isChecked())
        {
            sum=sum+240;
            book=c2.getText().toString();
            strb.append(book);
            str.append(sum);
        }
        if(c3.isChecked())
        {
            sum=sum+398;
            book=c3.getText().toString();
            strb.append(book);
            str.append(sum);
        }
        if(c4.isChecked())
        {
            sum=sum+349;
            book=c4.getText().toString();
            strb.append(book);
            str.append(sum);
        }
    }
    public void bill(View view)
    {

        Intent intent=new Intent(this,Main3Activity.class);
        intent.putExtra("n",str1);
        intent.putExtra("e",str2);
        intent.putExtra("p",str4);
        intent.putExtra("s",sum);
        intent.putExtra("bk",book);
        startActivity(intent);
    }


}
