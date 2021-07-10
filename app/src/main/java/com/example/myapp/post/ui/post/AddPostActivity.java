package com.example.myapp.post.ui.post;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapp.R;

public class AddPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_add_post);
        ImageView goBack = findViewById(R.id.add_post_back);
        goBack.setOnClickListener(v -> finish());
    }
}