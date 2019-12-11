package com.example.audioplayerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;

    public void playAudio(View view) {
//        mPlayer = MediaPlayer.create(this, R.raw.demoaudio);
        mPlayer.start();
    }

    public void pauseAudio(View view) {
        mPlayer.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayer = MediaPlayer.create(this, R.raw.demoaudio);
//        mPlayer.start();
    }
}
