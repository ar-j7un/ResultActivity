package com.example.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calc(View v)
    {
        Intent obj;
        obj= new Intent("act.sub");

        EditText e1 = (EditText) findViewById(R.id.e1);
        EditText e2 = (EditText) findViewById(R.id.e2);

        obj.putExtra("n1",e1.getText().toString());
        obj.putExtra("n2",e2.getText().toString());
        startActivityForResult(obj,1);

    }

    @Override
    protected void onActivityResult(int rq,int rc,Intent data){
        super.onActivityResult(rq,rc, data);
        EditText e;
        e = (EditText)findViewById(R.id.e);
        e.setText(data.getData().toString());
    }

}