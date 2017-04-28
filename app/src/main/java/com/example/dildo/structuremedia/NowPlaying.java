package com.example.dildo.structuremedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {
    private ImageButton playButton;

    private int foo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);


        ImageView backscreen = (ImageView) findViewById(R.id.now_playing_image);
        TextView playing_playlist = (TextView) findViewById(R.id.now_playing_playlist);
        ImageButton toCart = (ImageButton) findViewById(R.id.shopping_cart);


        Bundle bundle = getIntent().getExtras();
        foo = bundle.getInt("j");


        if (foo == 1) {
            backscreen.setImageResource(R.drawable.sunrisef);
            playing_playlist.setText(R.string.sunrise);

        } else if (foo == 2) {
            backscreen.setImageResource(R.drawable.bytheseaf);
            playing_playlist.setText(R.string.bythesea);
        } else {
            backscreen.setImageResource(R.drawable.night_skyf);
            playing_playlist.setText(R.string.nightsky);
        }

        toCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tc = new Intent(NowPlaying.this, PurchaseActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("foo", foo);
                tc.putExtras(bundle);
                startActivity(tc);
            }
        });


        playButton = (ImageButton) findViewById(R.id.play);
        playButton.setTag("playing");
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (playButton.getTag() == "playing") {
                    playButton.setImageResource(android.R.color.transparent);
                    playButton.setImageResource(R.drawable.pause_button);
                    playButton.setTag("stopping");
                } else {
                    playButton.setImageResource(android.R.color.transparent);
                    playButton.setImageResource(R.drawable.play_button);
                    playButton.setTag("playing");
                }
            }
        });
    }


}
