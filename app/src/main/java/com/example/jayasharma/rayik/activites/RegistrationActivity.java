package com.example.jayasharma.rayik.activites;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.jayasharma.rayik.R;
import com.example.jayasharma.rayik.app.Sharedprefence;
import com.example.jayasharma.rayik.helper.LocaleHelper;

public class RegistrationActivity extends AppCompatActivity {

    Sharedprefence sharedPreferences;

    EditText fname, lname,uname,email,dob,city,pass1,pass2;
    Button save;
    Spinner language_list, country_list;

    TextView alreadyText, loginText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        sharedPreferences = new Sharedprefence(RegistrationActivity.this);
        setFindByRViews();

        String languageCode = sharedPreferences.getLanguage();

        Context context = LocaleHelper.setLocale(this, languageCode);
        Resources resources = context.getResources();


            fname.setHint(resources.getString(R.string.fname));
            lname.setHint(resources.getString(R.string.lname));
            uname.setHint(resources.getString(R.string.uname));
            email.setHint(resources.getString(R.string.email));
            dob.setHint(resources.getString(R.string.dob));
            city.setHint(resources.getString(R.string.city));
            pass1.setHint(resources.getString(R.string.password_placeholder));
            pass2.setHint(resources.getString(R.string.conf_password));
            save.setText(resources.getString(R.string.save));



    }

    private void setFindByRViews()
    {
        fname = (EditText) findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        uname = (EditText) findViewById(R.id.lname);
        email = (EditText) findViewById(R.id.email);
        dob = (EditText) findViewById(R.id.dob);
        city = (EditText) findViewById(R.id.city);
        language_list = (Spinner) findViewById(R.id.language_list);
        country_list = (Spinner) findViewById(R.id.country_list);
        save = (Button) findViewById(R.id.save);

        pass1 = (EditText) findViewById(R.id.pass1);
        pass2 = (EditText) findViewById(R.id.pass2);


    }
}
