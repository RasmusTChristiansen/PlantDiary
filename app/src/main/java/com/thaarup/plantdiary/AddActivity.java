package com.thaarup.plantdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AddActivity extends AppCompatActivity {

    EditText name;
    ImageView plantpicture;
    FloatingActionButton newpicture, addpicture;

    Button save;

    Switch water, fertilizer, andet, replant, turn, moisture;
    Spinner waterspinner, fertilizerspinner, andetspinner, replantspinner, turnspinner, moisturespinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        name = findViewById(R.id.name);
        plantpicture = findViewById(R.id.plantpicture);
        newpicture = findViewById(R.id.newpicture);
        addpicture = findViewById(R.id.addpicture);


        water = findViewById(R.id.water);
        fertilizer = findViewById(R.id.fertilizer);
        andet = findViewById(R.id.andet);
        replant = findViewById(R.id.replant);
        turn = findViewById(R.id.turn);
        moisture = findViewById(R.id.moisture);

        save = findViewById(R.id.save);


        waterspinner = findViewById(R.id.waterspinner);
        fertilizerspinner = findViewById(R.id.fertilizerspinner);
        andetspinner = findViewById(R.id.andetspinner);
        replantspinner = findViewById(R.id.replantspinner);
        turnspinner = findViewById(R.id.turnspinner);
        moisturespinner = findViewById(R.id.moisturespinner);

        waterspinner.setVisibility(View.INVISIBLE);
        fertilizerspinner.setVisibility(View.INVISIBLE);
        andetspinner.setVisibility(View.INVISIBLE);
        replantspinner.setVisibility(View.INVISIBLE);
        turnspinner.setVisibility(View.INVISIBLE);
        moisturespinner.setVisibility(View.INVISIBLE);



        water.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    waterspinner.setVisibility(View.VISIBLE);
                } else {
                    waterspinner.setVisibility(View.INVISIBLE);
                }
            }
        });
        fertilizer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fertilizerspinner.setVisibility(View.VISIBLE);
                } else {
                    fertilizerspinner.setVisibility(View.INVISIBLE);
                }
            }
        });
        andet.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    andetspinner.setVisibility(View.VISIBLE);
                } else {
                    andetspinner.setVisibility(View.INVISIBLE);
                }
            }
        });
        replant.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    replantspinner.setVisibility(View.VISIBLE);
                } else {
                    replantspinner.setVisibility(View.INVISIBLE);
                }
            }
        });
        turn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    turnspinner.setVisibility(View.VISIBLE);
                } else {
                    turnspinner.setVisibility(View.INVISIBLE);
                }
            }
        });
        moisture.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    moisturespinner.setVisibility(View.VISIBLE);
                } else {
                    moisturespinner.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}