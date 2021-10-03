package com.example.calculator.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.calculator.R;


public class KgToPbFragment extends Fragment {


    Button convert;
    EditText editTextPb, editTextKg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_kg_to_pb, container, false);
        convert = v.findViewById(R.id.convert_btn4);
        editTextPb = v.findViewById(R.id.pb_et2);
        editTextKg = v.findViewById(R.id.kg_et2);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Kilo = editTextKg.getText().toString();

                double sum = Integer.valueOf(Kilo) * 2.205;

                editTextPb.setText(String.valueOf(sum));
            }
        });



        return v;
    }
}