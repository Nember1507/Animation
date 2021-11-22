package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView rocket;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rocket= findViewById(R.id.rocket);
        Button startFallingButton = findViewById(R.id.start);
        final Animation fallingAnimation = AnimationUtils.loadAnimation(this, R.anim.anim);
        startFallingButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                rocket.startAnimation(fallingAnimation);
                mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.rocket);
                mediaPlayer.start();
            }
        });
    }
}