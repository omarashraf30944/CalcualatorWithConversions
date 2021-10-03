package com.example.calculator.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.calculator.R;


public class CmToInchFragment extends Fragment {



    Button convert;
    EditText editTextCm, editTextIn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_cm_to_inch, container, false);
        convert = v.findViewById(R.id.convert_btn2);
        editTextCm = v.findViewById(R.id.cm2_et);
        editTextIn = v.findViewById(R.id.inch2_et);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Cm = editTextCm.getText().toString();

                double sum = Integer.valueOf(Cm) * 0.393700787;

                editTextIn.setText(String.valueOf(sum));
            }
        });



        return v;
    }
}