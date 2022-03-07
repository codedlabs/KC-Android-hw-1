package com.example.android.listviewproject;

import android.content.Intent;
import android.graphics.drawable.shapes.Shape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Shapes> shapesItems = new ArrayList<Shapes>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Shapes circle = new Shapes("circle",R.drawable.circle);
        shapesItems.add(circle);
        Shapes octagon = new Shapes("octagon",R.drawable.octagon);
        shapesItems.add(octagon);
        Shapes square = new Shapes("square",R.drawable.square);
        shapesItems.add(square);
        Shapes square0 = new Shapes("square",R.drawable.square);
        shapesItems.add(square0);
        Shapes square1 = new Shapes("square",R.drawable.square);
        shapesItems.add(square1);
        Shapes square2 = new Shapes("square",R.drawable.square);
        shapesItems.add(square2);
        Shapes square3 = new Shapes("square",R.drawable.square);
        shapesItems.add(square3);
        ListView listView = findViewById(R.id.list);

        ShapeAdapter shapeAdapter = new ShapeAdapter(this,shapesItems);
        listView.setAdapter(shapeAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Shapes selectedShape = (Shapes) listView.getItemAtPosition(i);

                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("shape", selectedShape);
                startActivity(intent);
            }
        });
    }
}