package com.vibhathakur.cityguide.Common.LoginSignup;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ScrollView;
import com.google.android.material.textfield.TextInputLayout;
import com.hbb20.CountryCodePicker;
import com.vibhathakur.cityguide.R;
public class SignUp3rdClass extends AppCompatActivity {
    ScrollView scrollView;
    TextInputLayout phoneNumber;
    CountryCodePicker countryCodePicker;
    //Get complete phone number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sign_up3rd_class);

        //Hooks
        phoneNumber = findViewById(R.id.phone_number);
        countryCodePicker = findViewById(R.id.country_code_picker);
    }


    }

