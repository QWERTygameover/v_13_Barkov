package com.example.barkov_v_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Nastroiki extends AppCompatActivity {

    Switch swOne;
    Switch swTwo;
    Switch swThree;

    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nastroiki);
        swOne = findViewById(R.id.switch1);
        swTwo = findViewById(R.id.switch2);
        swThree = findViewById(R.id.switch3);
        btnExit = findViewById(R.id.button2);

        swOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(swOne.isChecked()){
                    swOne.setTextColor(Color.parseColor("#FF08FF00"));
                }
                else{
                    swOne.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });
        swTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(swTwo.isChecked()){
                    swTwo.setTextColor(Color.parseColor("#FF08FF00"));
                }
                else{
                    swTwo.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });

        swThree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(swThree.isChecked()){
                    swThree.setTextColor(Color.parseColor("#FF08FF00"));
                }
                else{
                    swThree.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Exit();
            }
        });
    }

    public void Exit(){
        Intent intent = new Intent(this, Avtorizaciya.class);
        startActivity(intent);
    }
}