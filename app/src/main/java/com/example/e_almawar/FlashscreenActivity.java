package com.example.e_almawar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class FlashscreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_EAlMawar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashscreen);

        // Timer 3 Detik
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(FlashscreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Supaya ga bisa balik ke flashscreen
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out); // Animasi transisi
            }
        }, 3000); // 3 Detik
    }
}
