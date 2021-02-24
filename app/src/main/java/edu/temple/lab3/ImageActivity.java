package edu.temple.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference views
        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        // create array list of dogs
        ArrayList dogArray = new ArrayList<String>();
        dogArray.add("dog1");
        dogArray.add("dog2");
        dogArray.add("dog3");
        dogArray.add("dog4");

        // TODO images for dogs

        // custom adapter
        ImageAdapter adapter = new ImageAdapter(this, dogArray);
        spinner.setAdapter(adapter); // set the adapter of spinner

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}