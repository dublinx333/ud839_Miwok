
package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;      //new line added to support ListView

public class PicturesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picture_list);// replace with line below after refactoring

//        setContentView(R.layout.word_list);

        // Use the Picture class object which has 1 int (the resource id) and 1 string (the picture name)
// Create an array list of pictures based on the picture class
        ArrayList<Picture> pictures = new ArrayList<Picture>();
// Add picture items to the pictures array

        pictures.add(new Picture(R.drawable.donut, "donut"));
        pictures.add(new Picture(R.drawable.eclair, "eclair"));
        pictures.add(new Picture(R.drawable.froyo, "froyo"));
        pictures.add(new Picture(R.drawable.gingerbread, "gigerbread"));
        pictures.add(new Picture(R.drawable.honeycomb, "honeycomb"));
        pictures.add(new Picture(R.drawable.icecream, "icecream"));
        pictures.add(new Picture(R.drawable.jellybean, "jellybean"));
        pictures.add(new Picture(R.drawable.kitkat, "kitkat"));
        pictures.add(new Picture(R.drawable.lollipop, "lollipop"));
        pictures.add(new Picture(R.drawable.marshmallow, "marshmallow"));

// Create the a new PictureAdapter object.
// Make sure the constructor (in the PictureAdapter.java file)
// Ex: public PictureAdapter(Context context, ArrayList<Picture> objects) {}
// matches the parameters to create a new object
// Ex: new PictureAdapter(this, pictures)

        PictureAdapter adapter = new PictureAdapter(this, pictures);

// Added the line below because I was getting a null reference

        setContentView(R.layout.picture_list);
        ListView listView = (ListView) findViewById(R.id.piclist);

//Attach the adapter to the view

        listView.setAdapter(adapter);

    }
}