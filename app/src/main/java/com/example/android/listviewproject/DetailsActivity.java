package com.example.android.listviewproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        TextView textView = findViewById(R.id.textView);
        ImageView imageView = findViewById(R.id.imageView);
        Bundle bundle = getIntent().getExtras();
        final Shapes shapes = (Shapes) bundle.getSerializable("shape");

        imageView.setImageResource(shapes.getShapeImage());
        textView.setText(shapes.getShapeName());
    }
}