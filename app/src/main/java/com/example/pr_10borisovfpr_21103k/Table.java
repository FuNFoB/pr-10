package com.example.pr_10borisovfpr_21103k;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Table extends AppCompatActivity implements View.OnClickListener {

    LinearLayout ln;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        ln = findViewById(R.id.btn1);
        ln.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this,Showitem.class));
    }
}