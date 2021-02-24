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
    int[] dogImages;

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
        dogArray.add("Happy Dog");
        dogArray.add("Masked Dog");
        dogArray.add("Many Dogs");
        dogArray.add("Doge");

        // images for dogs
        dogImages = new int[]{R.drawable.dog1, R.drawable.dog2, R.drawable.dog3, R.drawable.dog4};

        // custom adapter
        ImageAdapter adapter = new ImageAdapter(this, dogArray);
        spinner.setAdapter(adapter); // set the adapter of spinner

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                showPicture(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void showPicture(int position) {
        imageView.setImageResource(dogImages[position]);
    }
}