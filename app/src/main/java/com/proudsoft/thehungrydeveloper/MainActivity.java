package com.proudsoft.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    CardView cardViewStarters;
    CardView cardViewMains;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewStarters = findViewById(R.id.card_view_starters);
        cardViewMains = findViewById(R.id.card_view_mains);
    }
}