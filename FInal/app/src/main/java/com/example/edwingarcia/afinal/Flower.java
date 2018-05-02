package com.example.edwingarcia.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Flower extends AppCompatActivity implements View.OnClickListener{
    private CardView westernYarrowCard, redMapleCard, lemonNeedleGrassCard, longLeafPineCard
            , tulipPoplar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);
        //defining flower cards
        westernYarrowCard = findViewById(R.id.WesternYarrow);
        redMapleCard = findViewById(R.id.RedMaple);
        lemonNeedleGrassCard = findViewById(R.id.LemonsNeedleGrass);
        longLeafPineCard = findViewById(R.id.LongLeafPine);
        tulipPoplar = findViewById(R.id.TulipPoplar);
        //add CLick Listener to Cards
        westernYarrowCard.setOnClickListener(this);
        redMapleCard.setOnClickListener(this);
        lemonNeedleGrassCard.setOnClickListener(this);
        longLeafPineCard.setOnClickListener(this);
        tulipPoplar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        // every time there is a click it will check which card was clicked.
        switch (v.getId()) {
            case R.id.WesternYarrow: i = new Intent(this, WesternYarrow.class);
                startActivity(i);
                break;
            case R.id.RedMaple : i = new Intent(this, RedMaple.class);
                startActivity(i); break;
            case R.id.LemonsNeedleGrass : i = new Intent(this, LemonNeedleGrass.class);
                startActivity(i); break;
            case R.id.LongLeafPine: i = new Intent(this, LongLeafPine.class);
                startActivity(i); break;
            case R.id.TulipPoplar : i = new Intent(this, TulipPoplar.class);
                startActivity(i); break;
            default:break;
        }
    }
}
