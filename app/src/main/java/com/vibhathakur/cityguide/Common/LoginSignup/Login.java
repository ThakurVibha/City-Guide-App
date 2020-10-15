package com.vibhathakur.cityguide.Common.LoginSignup;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import com.vibhathakur.cityguide.R;
public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_retailer_login);
    }
    public void forgetPasswordScreen(View view){
        Intent intent=new Intent(getApplicationContext(),ForgetPassword.class);
        startActivity(intent);
    }
}
