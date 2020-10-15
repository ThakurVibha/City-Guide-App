package com.vibhathakur.cityguide.Common;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.vibhathakur.cityguide.PermissionActivity;
import com.vibhathakur.cityguide.R;
import com.vibhathakur.cityguide.User.UserDashboard;
public class SplashScreen extends AppCompatActivity {
ImageView backgroundImage;
TextView poweredByLine;
Animation sideAnim, bottomAnim;
SharedPreferences onBoardingScreen;
private static int SPLASH_TIMER=4000;//duration of animation
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Above code to remove status bar
        setContentView(R.layout.splash_screen);
        //Hooks
        backgroundImage=findViewById(R.id.background_image);
        poweredByLine=findViewById(R.id.powered_by_line);
        //Animations
sideAnim= AnimationUtils.loadAnimation(this,R.anim.side_anim);
bottomAnim=AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
//set animations on elements
        backgroundImage.setAnimation(sideAnim);
        backgroundImage.setAnimation(bottomAnim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onBoardingScreen=getSharedPreferences("onBoardingScreen",MODE_PRIVATE);
                boolean isFirstTime=onBoardingScreen.getBoolean("isFirstTime",true);

                if(isFirstTime){
                 SharedPreferences.Editor editor=onBoardingScreen.edit();
                 editor.putBoolean("isFirstTime",false);
                 editor.commit();
                    Intent intent=new Intent(SplashScreen.this, OnBoarding.class);
                    Intent intent2=new Intent(SplashScreen.this, PermissionActivity.class);

                    //We can also use getApplication as context of present activity
                    startActivity(intent);
                    startActivity(intent2);// finish() will destroyed this activity
                    //call the next activity
                    finish();
                }
                else{
                    Intent intent=new Intent(SplashScreen.this, UserDashboard.class);//We can also use getApplication as context of present activity
                    startActivity(intent);// finish() will destoyed this activity
                    //call the next activity
                    finish();
                }
            }
        },SPLASH_TIMER);
    }
}
