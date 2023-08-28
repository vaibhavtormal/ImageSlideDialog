package com.example.dailog;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] imageIds = {R.drawable.image1, R.drawable.image2,R.drawable.image3};
        int delay = 2000;
        boolean keepSwitching = true;

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button showButton = findViewById(R.id.showButton);
        showButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ImageSliderDailog dailog = new ImageSliderDailog(MainActivity.this,imageIds,delay, keepSwitching);
                dailog.show();
            }
        });


    }

    private class ImageSliderDailog {
        public ImageSliderDailog(MainActivity mainActivity, int[] imageIds, int delay, boolean keepSwitching) {

        }

        public void show() {

        }
    }
}