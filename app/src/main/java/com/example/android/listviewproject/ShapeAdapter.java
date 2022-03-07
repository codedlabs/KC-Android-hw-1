package com.example.android.listviewproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

class ShapeAdapter extends ArrayAdapter<Shapes> {
    List<Shapes> shapes;
    public ShapeAdapter(Context context, List<Shapes> shapes) {

        super(context, 0, shapes);
        this.shapes = shapes;

    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {


        view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);


        Shapes currentShapes = getItem(position);
        TextView shapeNameTextView = view.findViewById(R.id.shapeName);
        shapeNameTextView.setText(currentShapes.getShapeName());
        ImageView shapeImageTextView = view.findViewById(R.id.shapeImage);
        shapeImageTextView.setImageResource(currentShapes.getShapeImage());

        ImageView delete = view.findViewById(R.id.deleteShape);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getContext(), +"", Toast.LENGTH_SHORT).show();
                shapes.remove(position);
                notifyDataSetChanged();

            }
        });
        return view;

    }


}
