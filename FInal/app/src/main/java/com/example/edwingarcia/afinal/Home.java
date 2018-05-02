package com.example.edwingarcia.afinal;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.animation.Animator;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity implements View.OnClickListener{
    private CardView flowerCard, photoCard, shareCard, shopCard, bookmarkCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // defining cards
        flowerCard = findViewById(R.id.flower_card);
        photoCard = findViewById(R.id.photo_card);
        shareCard = findViewById(R.id.share_card);
        shopCard = findViewById(R.id.shop_card);
        bookmarkCard = findViewById(R.id.bookmark_card);
        //Add Click listener to the cards
        flowerCard.setOnClickListener(this);
        photoCard.setOnClickListener(this);
        shareCard.setOnClickListener(this);
        shopCard.setOnClickListener(this);
        bookmarkCard.setOnClickListener(this);
    }

    /**
     *  on click method will call every time we click on a card view.
     */
    @Override
    public void onClick(View v) {
        Intent i;
        // every time there is a click it will check which card was clicked.
        switch(v.getId()) {
            case R.id.flower_card : i = new Intent(this, Flower.class);
                startActivity(i); break;
            case R.id.photo_card : i = new Intent(this, Photo.class);
                startActivity(i); break;
            case R.id.share_card : i = new Intent(this, Share.class);
                startActivity(i); break;
            case R.id.shop_card : i = new Intent(this, Shop.class);
                startActivity(i) ;break;
            case R.id.bookmark_card : i = new Intent(this, Bookmarked.class);
                startActivity(i); break;
            default: break;
        }
    }
}
