package com.med.db;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences {

// shared preferences is a technique or approach to store data
// we can store small data into it
// it is a form of database


    SharedPreferences sharedPreferences;

    public Preferences(Context context) {
        sharedPreferences = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE);
    }


    public void setTitle(String value) {
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putString("title", value);
        myEdit.commit();
    }

    public String getTitle() {

        String value = sharedPreferences.getString("title", "MainTitle");

        return value;
    }


}
