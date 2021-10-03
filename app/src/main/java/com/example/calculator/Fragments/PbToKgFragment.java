package com.example.calculator.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.calculator.R;


public class PbToKgFragment extends Fragment {
    Button convert;
    EditText editTextPb, editTextKg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_pb_to_kg, container, false);
        convert = v.findViewById(R.id.convert_btn3);
        editTextPb = v.findViewById(R.id.pb_et);
        editTextKg = v.findViewById(R.id.kg_et);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Pound = editTextPb.getText().toString();

                double sum = Integer.valueOf(Pound) * 0.45359237;

                editTextKg.setText(String.valueOf(sum));
            }
        });



        return v;
    }
}