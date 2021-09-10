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


public class EventDetailsFragment extends Fragment {
    private EditText event_Title;
    private EditText event_Description;
    private Button btnTimeAndDateFragment;
    private NavController navController;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        initView(view);
    }

    private void initView(View view) {
        event_Title = view.findViewById(R.id.event_title);
        event_Description = view.findViewById(R.id.event_description);
        btnTimeAndDateFragment = view.findViewById(R.id.btnTimeAndDateFragment);
        btnTimeAndDateFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String event_Title1 = event_Title.getText().toString();
                String event_Description1  = event_Description.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("event_Title2", event_Title1);
                bundle.putString("event_Description2", event_Description1);
               navController.navigate(R.id.action_eventDetailsFragment_to_timeAnddate, bundle);

            }
        });


    }
}