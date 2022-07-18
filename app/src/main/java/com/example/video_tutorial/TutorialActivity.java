package com.example.video_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TutorialActivity extends AppCompatActivity {

    VideoView vdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        vdt = (VideoView) findViewById(R.id.vdt);

        vdt.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videotutorial));

        MediaController mediaController = new MediaController(this);
        vdt.setMediaController(mediaController);

        vdt.start();

    }
}