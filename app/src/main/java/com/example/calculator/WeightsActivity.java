package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.calculator.Fragments.CmToInchFragment;
import com.example.calculator.Fragments.InchToCmFragment;
import com.example.calculator.Fragments.KgToPbFragment;
import com.example.calculator.Fragments.PbToKgFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class WeightsActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weights);

        bottomNavigationView = findViewById(R.id.bottom_navigation2);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout2,new PbToKgFragment())
                .commit();
        bottomNavigationView.setSelectedItemId(R.id.P2K);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.P2K){
                    showFragment(new PbToKgFragment());
                }else if (item.getItemId() == R.id.K2P){
                    showFragment(new KgToPbFragment());
                }
                return true;
            }
        });

    }
    private void showFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout2,fragment)
                .commit();
    }
}