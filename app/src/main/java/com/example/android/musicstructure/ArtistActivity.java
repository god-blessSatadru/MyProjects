package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArtistActivity extends AppCompatActivity implements View.OnClickListener {
    Button mShowAlbums, mShowArtists, mShowSongs, mShowPlayLists, mShowHomeScreen;
    Intent intent;
    TextView mActivityDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);
        mShowAlbums = (Button) findViewById(R.id.show_albums);
        mShowArtists = (Button) findViewById(R.id.show_artists);
        mShowSongs = (Button) findViewById(R.id.show_songs);
        mShowPlayLists = (Button) findViewById(R.id.show_play_lists);
        mShowHomeScreen = (Button) findViewById(R.id.main_screen);
        mActivityDescription = (TextView) findViewById(R.id.activity_description);
        mShowAlbums.setOnClickListener(this);
        mShowArtists.setOnClickListener(this);
        mShowSongs.setOnClickListener(this);
        mShowPlayLists.setOnClickListener(this);
        mShowHomeScreen.setOnClickListener(this);
        mActivityDescription.setText("This Activity lists the Artists featured need to use the API described in " +
                "android.provider.MediaStore class.");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_albums:
                intent = new Intent(ArtistActivity.this, AlbumsActivity.class);
                break;
            case R.id.show_artists:
                intent = new Intent(ArtistActivity.this, ArtistActivity.class);
                break;
            case R.id.show_songs:
                intent = new Intent(ArtistActivity.this, SongActivity.class);
                break;
            case R.id.show_play_lists:
                intent = new Intent(ArtistActivity.this, ActivityPlayList.class);
                break;
            case R.id.main_screen:
                intent = new Intent(ArtistActivity.this, MainActivity.class);
        }
        startActivity(intent);
    }
}
