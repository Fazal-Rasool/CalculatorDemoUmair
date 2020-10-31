package com.med.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.med.db.Preferences;
import com.med.models.Model;

public class SecondActivity extends AppCompatActivity {

    TextView tvName, tvAdd, tvPhone;

    Preferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);


        preferences = new Preferences(this);
        String value = preferences.getTitle();

        setTitle(value);

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