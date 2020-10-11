package com.med.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvName, tvAdd, tvPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);


        setViews();
        getData();


    }

    private void setViews() {

        tvName = findViewById(R.id.tvName);
        tvPhone = findViewById(R.id.tvPhone);
        tvAdd = findViewById(R.id.tvAdd);


    }

    private void getData() {

      Model model = (Model) getIntent().getSerializableExtra("model");


      tvName.setText(model.getName());
      tvPhone.setText(model.getPhone());
      tvAdd.setText(model.getAddress());


    }


}