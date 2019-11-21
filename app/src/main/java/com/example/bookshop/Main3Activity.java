package com.example.bookshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
String st1,st2,st3,st4,st5;
TextView tv;
int s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv=findViewById(R.id.textView2);
        Intent i=getIntent();
        st1=i.getStringExtra("name");
        st2=i.getStringExtra("email");
        st3=i.getStringExtra("phone");
        st4=i.getStringExtra("s");
        st5=i.getStringExtra("bk");
        s2=Integer.parseInt(String.valueOf(st4));
        tv.setText("Name:"+st1+"\n"+"Email:"+st2+"\n"+"Phone:"+st3+"\n"+"Books selected:"+st5+"\n+"+"Total:"+st4);
    }
    public void visit(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(intent);
    }
}
