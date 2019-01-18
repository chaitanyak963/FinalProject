package com.example.venky.jokesandroidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    TextView joke_textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        joke_textView = findViewById(R.id.joke_textview);
        String joke = getIntent().getStringExtra("KEY");
        joke_textView.setText(joke);
    }
}
