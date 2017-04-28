package com.example.dildo.structuremedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PurchaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        Bundle bundle = getIntent().getExtras();
        int foo = bundle.getInt("foo");
        TextView selectedPlaylistName = (TextView) findViewById(R.id.playlist_name);
        ImageView selectedPlaylistImage = (ImageView) findViewById(R.id.selected_playlist_image);


        if (foo == 1) {
            selectedPlaylistImage.setImageResource(R.drawable.sunrisef);
            selectedPlaylistName.setText(R.string.sunrise);

        } else if (foo == 2) {
            selectedPlaylistImage.setImageResource(R.drawable.bytheseaf);
            selectedPlaylistName.setText(R.string.bythesea);
        } else {
            selectedPlaylistImage.setImageResource(R.drawable.night_skyf);
            selectedPlaylistName.setText(R.string.nightsky);
        }

    }
}
