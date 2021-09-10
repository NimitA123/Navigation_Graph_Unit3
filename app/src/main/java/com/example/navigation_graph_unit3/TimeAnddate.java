package com.example.navigation_graph_unit3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TimeAnddate extends Fragment {
    private EditText StartDate;
    private EditText EndDate;
    private EditText StartTime;
    private EditText EndTime;
    private Button btnPriceDetails;
    private NavController navController;
    private String event_Title;
    private String event_Description;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!= null){
            event_Title = getArguments().getString("event_Title2");
            event_Description = getArguments().getString("event_Description2");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_time_anddate, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        initView(view);
    }

    private void initView(View view) {
        StartDate = view.findViewById(R.id.Start_Date);
        EndDate = view.findViewById(R.id.End_Date);
        StartTime = view.findViewById(R.id.Start_Time);
        EndTime = view.findViewById(R.id.End_Time);
        btnPriceDetails = view.findViewById(R.id.btnPriceDetailsFragment);
        btnPriceDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Start_Date1 = StartDate.getText().toString();
                String End_Date1  = EndDate.getText().toString();
                String Start_Time1 = StartTime.getText().toString();
                String End_Time1  = EndTime.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("event_Title3", event_Title);
                bundle.putString("event_Description3", event_Description);
                bundle.putString("Start_Date1", Start_Date1);
                bundle.putString("End_Date1", End_Date1);
                bundle.putString("Start_Time1", Start_Time1);
                bundle.putString("End_Time1", End_Time1);
                navController.navigate(R.id.action_timeAnddate_to_blankFragment, bundle);


            }
        });


    }
}