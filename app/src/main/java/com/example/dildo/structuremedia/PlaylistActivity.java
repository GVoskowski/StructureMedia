package com.example.dildo.structuremedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        ImageView view1 = (ImageView) findViewById(R.id.playlist_1);
        ImageView view2 = (ImageView) findViewById(R.id.playlist_2);
        ImageView view3 = (ImageView) findViewById(R.id.playlist_3);

        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlaylistActivity.this, NowPlaying.class);
                Bundle bundle = new Bundle();
                bundle.putInt("j", 1);
                i.putExtras(bundle);
                startActivity(i);

            }
        });
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlaylistActivity.this, NowPlaying.class);
                Bundle bundle = new Bundle();
                bundle.putInt("j", 2);
                i.putExtras(bundle);
                startActivity(i);

            }
        });
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlaylistActivity.this, NowPlaying.class);
                Bundle bundle = new Bundle();
                bundle.putInt("j", 3);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}
