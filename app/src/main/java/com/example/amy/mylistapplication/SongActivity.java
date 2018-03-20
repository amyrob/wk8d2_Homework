package com.example.amy.mylistapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        Intent intent = getIntent();
        Song selectedSong = (Song) intent.getSerializableExtra("song");
        Log.d("SongActivity", selectedSong.getTitle());
    }
}
