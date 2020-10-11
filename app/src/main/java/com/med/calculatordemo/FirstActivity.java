package com.med.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    Button btnGo, btnImplicit;
    EditText etName, etPhone, etAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        setViews();
        setListeners();





    }


    public void setViews() {

        btnGo = findViewById(R.id.btnGo);
        btnImplicit = findViewById(R.id.btnImplicit);
        etName = findViewById(R.id.etName);
        etAdd = findViewById(R.id.etAdd);
        etPhone = findViewById(R.id.etPhone);


    }


    public void setListeners(){


        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = etName.getText().toString();
                String phone = etPhone.getText().toString();
                String address = etAdd.getText().toString();

                Model model = new Model();

                model.setName(name);
                model.setPhone(phone);
                model.setAddress(address);



                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("model", model);
                startActivity(intent);

            }
        });


        btnImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.vogella.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });
    }


}