package com.example.jayasharma.rayik.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;


public class Sharedprefence
{

    public static final String key_fname = "firstname";
    public static final String key_lname = "lastname";
    public static final String key_uname = "username";
    public static final String key_email = "email";
    public static final String key_date_of_birth = "date_of_birth";
    public static final String key_language = "language";
    public static final String key_country = "country";
    public static final String key_city = "city";
    public static final String key_password = "password";
    public static final String key_confirm_password = "confirmPass";
    public static final String KEY_LOGGED_IN = "loggedin";
    private static final String PREFER_NAME = "AndroidExamplePref";
    public static final String KEY_ACTIVITY = "activity";
    public static Editor editor;
    int PRIVATE_MODE = 0;
    Context _context;
    SharedPreferences pref;


    public Sharedprefence(Context context) {
        this._context = context;
        this.pref = this._context.getSharedPreferences(PREFER_NAME, this.PRIVATE_MODE);
        editor = this.pref.edit();
    }


    public String getLaunchActivity()
    {
        return this.pref.getString(KEY_ACTIVITY, "jaya");
    }

    public void setLaunchActivity(String activity) {
        editor.putString(KEY_ACTIVITY, activity);
        editor.commit();
    }

    public String getPassword()
    {
        return this.pref.getString(key_password, null);
    }

    public void setPassword(String password) {
        editor.putString(key_password, password);
        editor.commit();
    }

    public String getDateOfBirth()
    {
        return this.pref.getString(key_date_of_birth, null);
    }

    public void setDateOfBirth(String dob) {
        editor.putString(key_date_of_birth, dob);
        editor.commit();
    }

    public String getLanguage()
    {
        return this.pref.getString(key_language, null);
    }

    public void setLanguage(String lang) {
        editor.putString(key_language, lang);
        editor.commit();
    }

    public String getCountry()
    {
        return this.pref.getString(key_country, null);
    }

    public void setCountry(String countryy) {
        editor.putString(key_country, countryy);
        editor.commit();
    }

    public String getCity()
    {
        return this.pref.getString(key_city, null);
    }

    public void setCity(String cityy) {
        editor.putString(key_city, cityy);
        editor.commit();
    }

    public String getConfirmPassword()
    {
        return this.pref.getString(key_confirm_password, null);
    }

    public void setConfirmPassword(String confirmPass) {
        editor.putString(key_confirm_password, confirmPass);
        editor.commit();
    }


    public String getFirstName()
    {
        return this.pref.getString(key_fname, null);
    }

    public void setFirstName(String ffname) {
        editor.putString(key_fname, ffname);
        editor.commit();
    }

    public String getLastName()
    {
        return this.pref.getString(key_lname, null);
    }

    public void setLastName(String llname) {
        editor.putString(key_lname, llname);
        editor.commit();
    }


    public String getUserName()
    {
        return this.pref.getString(key_uname, null);
    }

    public void setUserName(String name) {
        editor.putString(key_uname, name);
        editor.commit();
    }

    public void setLoggedIn(boolean isLoggedIn) {
        editor.putBoolean(KEY_LOGGED_IN, isLoggedIn);
        editor.commit();
    }



    public void setEmail(String email) {
        editor.putString(key_email, email);
        editor.commit();
    }

    public String getEmail()
    {
        return this.pref.getString(key_email, null);
    }



    // Check for login
    public boolean isUserLoggedIn(){
        return pref.getBoolean(KEY_LOGGED_IN, false);
    }





}
