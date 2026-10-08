package com.example.grid;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] images = {
            R.drawable.messi,
            R.drawable.ronaldo,
            R.drawable.neymar,
            R.drawable.yama,
            R.drawable.mbappe,
            R.drawable.raphinha
    };

    String[] names = {
            "Messi",
            "Ronaldo",
            "Neymar",
            "Yama",
            "Mbappe",
            "Raphinha"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);


        ImageAdapter adapter = new ImageAdapter(this, images);


        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(
                            AdapterView<?> parent,
                            View view,
                            int position,
                            long id) {

                        showAlertDialog(position);
                    }
                }
        );
    }

    private void showAlertDialog(int position) {


        ImageView imageView = new ImageView(this);


        imageView.setImageResource(images[position]);

        imageView.setPadding(20, 20, 20, 20);


        AlertDialog.Builder builder =
                new AlertDialog.Builder(this);

        builder.setTitle(names[position]);

        builder.setMessage(
                "You selected " + names[position]
        );


        builder.setIcon(images[position]);

        builder.setPositiveButton("OK", null);

        builder.show();
    }
}