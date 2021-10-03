package com.example.calculator.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.calculator.R;


public class InchToCmFragment extends Fragment {

    Button convert;
    EditText editTextCm, editTextIn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_inch_to_cm, container, false);
        convert = v.findViewById(R.id.convert_btn);
        editTextCm = v.findViewById(R.id.cm_et);
        editTextIn = v.findViewById(R.id.inch_et);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Inch = editTextIn.getText().toString();

                double sum = Integer.valueOf(Inch) * 2.54;

                editTextCm.setText(String.valueOf(sum));
            }
        });



        return v;
    }
}