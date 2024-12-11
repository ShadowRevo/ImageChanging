package com.example.changingphotos;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int currentIndex = 1;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton buttonUp = findViewById(R.id.buttonUp);
        ImageButton buttonDown = findViewById(R.id.buttonDown);
        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.cheeta);
        buttonUp.setOnClickListener(v -> showNextImage());
        buttonDown.setOnClickListener(v -> showPreviousImage());
    }
    private void showNextImage() {
        currentIndex++;
        if (currentIndex > 5) {
            currentIndex = 1;
        }
        updateImage();
    }

    private void showPreviousImage() {
        currentIndex--;
        if (currentIndex < 1) {
            currentIndex = 5;
        }
        updateImage();
    }

    private void updateImage() {
        if (currentIndex == 1) {
            imageView.setImageResource(R.drawable.cheeta);
        } else if (currentIndex == 2) {
            imageView.setImageResource(R.drawable.jaguar);
        } else if (currentIndex == 3) {
            imageView.setImageResource(R.drawable.lion);
        } else if (currentIndex == 4) {
            imageView.setImageResource(R.drawable.wolf);
        } else if (currentIndex == 5) {
            imageView.setImageResource(R.drawable.tiger);
        }
    }
}