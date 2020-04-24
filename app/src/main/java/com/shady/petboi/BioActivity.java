package com.shady.petboi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {
    private ImageView petImageView;
    private TextView petName, petBio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImageView = findViewById(R.id.petimageView);
        petName = findViewById(R.id.petName);
        petBio = findViewById(R.id.petBio);

        extras = getIntent().getExtras();
        String name = extras.getString("name");
        String bio = extras.getString("bio");

        setUp(name, bio);
    }

    public void setUp(String name, String bio){

        if(name.equals("Tom")) {
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            petName.setText(name);
            petBio.setText(bio);
        }
        else if(name.equals("Jerry")) {
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.cat));
            petName.setText(name);
            petBio.setText(bio);
        }

        }


}
