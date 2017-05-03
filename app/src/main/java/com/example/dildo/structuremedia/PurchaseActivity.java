package com.example.dildo.structuremedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
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

        ImageButton info = (ImageButton)findViewById(R.id.inform_button);
        final Button skip = (Button)findViewById(R.id.skip_information);
        final TextView infoText=(TextView)findViewById(R.id.purchase_information);


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

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoText.setVisibility(View.VISIBLE);
                skip.setVisibility(View.VISIBLE);
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoText.setVisibility(View.GONE);
                skip.setVisibility(View.GONE);
            }
        });

    }

}
