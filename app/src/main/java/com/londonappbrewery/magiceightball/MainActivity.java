package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.IconMarginSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView img_eightBall = findViewById(R.id.img_eightBall);
        img_eightBall.setImageResource(R.drawable.ball1);

        final int arr_ballImages[] = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5 };

        Button btn_ask = findViewById(R.id.btn_ask);
        btn_ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rng = new Random();
                int r = rng.nextInt(5);
                img_eightBall.setImageResource(arr_ballImages[r]);
            }
        });
    }
}
