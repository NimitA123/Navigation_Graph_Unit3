package com.example.navigation_graph_unit3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Preview extends AppCompatActivity {
    private TextView tv;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initView();
    }

    private void initView() {
        tv = findViewById(R.id.textView);
        tv1 = findViewById(R.id.textView2);
        tv2 = findViewById(R.id.textView3);
        tv3 = findViewById(R.id.textView4);
        tv4 = findViewById(R.id.textView5);
        tv5 = findViewById(R.id.textView6);
        tv6 = findViewById(R.id.textView7);
        tv7 = findViewById(R.id.textView8);
        Model model = (Model) getIntent().getSerializableExtra("model");
        tv.setText(model.getEvent_Title1());
        tv1.setText(model.getEvent_Description());
        tv2.setText(model.getStart_Date1());
        tv3.setText(model.getEnd_Date1());
        tv4.setText(model.getStart_Time1());
        tv5.setText(model.getEnd_Time1());
        tv6.setText(model.getCurrency()+"");
        tv7.setText(model.getPrice()+"");



    }



}