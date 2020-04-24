package com.shady.petboi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView dog, cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dog = findViewById(R.id.dog);
        cat = findViewById(R.id.cat);

        dog.setOnClickListener(this);
        cat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.dog:
                Intent dog = new Intent(MainActivity.this, BioActivity.class);
                dog.putExtra("name", "Tom");
                dog.putExtra("bio", "This is very naughty dog and always fighting with cat");
                startActivity(dog);
                Toast.makeText(MainActivity.this, "Dog is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cat:
                Intent cat = new Intent(MainActivity.this, BioActivity.class);
                cat.putExtra("name", "Jerry");
                cat.putExtra("bio", "This is very naughty cat and always fighting with dog");
                startActivity(cat);
                Toast.makeText(MainActivity.this, "Cat is clicked", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
