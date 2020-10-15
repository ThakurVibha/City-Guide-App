package com.vibhathakur.cityguide.Common.LoginSignup;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.vibhathakur.cityguide.R;
public class ForgetPassword extends AppCompatActivity {
    Button wayToResetPasswordScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_forget_password);
        wayToResetPasswordScreen=findViewById(R.id.wayToForget);
        wayToResetPasswordScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MakeSelection.class);
                startActivity(intent);
            }
        });
    }
}
