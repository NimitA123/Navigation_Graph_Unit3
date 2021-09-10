package com.example.navigation_graph_unit3;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class BlankFragment extends Fragment {

    private EditText Currency;
    private EditText Price;
    private Button btnPreviewActivity;
    private NavController navController;
    private String event_Title2;
    private String event_Description;
    private String start_Date1;
    private String End_Date1;
    private String start_Time1;
    private String End_Time1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
             event_Title2= getArguments().getString("event_Title3");
             event_Description = getArguments().getString("event_Description3");
             start_Date1 = getArguments().getString("Start_Date1");
             End_Date1 = getArguments().getString("End_Date1");
             start_Time1 = getArguments().getString("Start_Time1");
             End_Time1 = getArguments().getString("End_Time1");
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        Currency = view.findViewById(R.id.Currency);
        Price = view.findViewById(R.id.Price);
        btnPreviewActivity = view.findViewById(R.id.btnPreviewActivity);
        btnPreviewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  int  Currency1=Integer.parseInt(Currency.getText().toString());
                  int Price1 = Integer.parseInt(Price.getText().toString());
                  Model model = new Model(event_Title2, event_Description,  start_Date1,  End_Date1, start_Time1, End_Time1, Currency1, Price1);
                  Intent intent = new Intent(getContext(), Preview.class);
                  intent.putExtra("model", model);
                  startActivity(intent);
            }
        });


    }
}