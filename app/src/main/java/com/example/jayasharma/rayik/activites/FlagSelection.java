package com.example.jayasharma.rayik.activites;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.jayasharma.rayik.R;
import com.example.jayasharma.rayik.app.Sharedprefence;
import com.example.jayasharma.rayik.helper.LocaleHelper;

public class FlagSelection extends AppCompatActivity {

    Sharedprefence sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_selection);

        final LinearLayout lan_ar = (LinearLayout)  findViewById(R.id.lan_ar);
        final LinearLayout lan_eng = (LinearLayout)  findViewById(R.id.lan_eng);

        sharedPreferences = new Sharedprefence(this);
        lan_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // PreferenceManager.getDefaultSharedPreferences(FlagSelection.this).edit().putString("LANG", "ar").commit();

                sharedPreferences.setLanguage("en");
                Intent i = new Intent(FlagSelection.this, RegistrationActivity.class);
                startActivity(i);

            }
        });
        lan_ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences.setLanguage("ar");

               // PreferenceManager.getDefaultSharedPreferences(FlagSelection.this).edit().putString("LANG", "en").commit();

                Intent i = new Intent(FlagSelection.this, RegistrationActivity.class);
                startActivity(i);
            }
        });

    }


    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base));
    }
}
