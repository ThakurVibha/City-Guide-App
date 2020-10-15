package com.vibhathakur.cityguide.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.vibhathakur.cityguide.R;

public class RetailerStartUpScreen extends AppCompatActivity {
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_retailer_start_up_screen);
        signup=findViewById(R.id.signup_btn);

    }
public void callSignUp1(View view){
    Intent intent = new Intent(RetailerStartUpScreen.this, SignUp1.class);
startActivity(intent);
}

    public void callLoginScreen(View view) {
        Intent intent = new Intent(RetailerStartUpScreen.this, Login.class);
        Pair[] pairs = new Pair[1];
        pairs[0] = new Pair<View, String>(findViewById(R.id.login_btn), "transition_login");
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(RetailerStartUpScreen.this, pairs);
            startActivity(intent, options.toBundle());
        } else {
            Log.d("test","This is test");

            startActivity(intent);
        }
    }
}




