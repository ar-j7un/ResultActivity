package com.example.resultactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Bundle bb = getIntent().getExtras();
        String s1,s2;
        s1 = bb.getString("n1");
        s2 = bb.getString("n2");
        int a,b;
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        int c = a  +b;
        Intent res = new Intent();
        res.setData(Uri.parse("" + c));
        setResult(RESULT_OK,res);
        finish();

//
    }

    public void toSum(View v)
    {
        finish();

    }
}