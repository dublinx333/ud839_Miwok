package com.example.android.miwok;



import android.content.Context;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
/**import android.widget.ListView; */

import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;


import java.util.ArrayList;


// You also need to create a constructor in the WordAdapter class. It should have the same parameters
// as the arguments you pass into it when making an instance of the WordAdapter in the NumbersActivity.
// When you make a WordAdapter in NumbersActivity it says:
//        WordAdapter adapter = new WordAdapter(this, words);
//
//        where 'this' is of type Context and 'words' is of type ArrayList. ArrayList is a subtype of List.
//
//        So you need a constructor that starts with:
//public WordAdapter(Context context, List<Word> objects) {}
//

public class WordAdapter extends ArrayAdapter <Word>{


// Constructor.  The use of the WordAdapter (ex: in NumbersActivity.java) must pass in an arraylist of word objects


    public WordAdapter(Context context, ArrayList<Word> words){
        // as this is not a single text . The adapter is not using the second argument
        // so, it can be any value. Here, I used 0.
         super(context,0,words);

    }

// From Android Flavors app
/**
    public View getView(int position, View convertView, ViewGroup parent) {

// Check if the existing view is being reused, otherwise inflate the view
// Specify the type of view to use (ex: lisItem)
// assign the convertView to it
// Inflators allow you to convert xml to an object
// Once listView object is created you can assign values

        View listItemView = convertView;
        if(listItemView == null)
        { listItemView = LayoutInflater.from(getContext()).inflate( R.layout.list_item, parent, false);
        }


// Get the {@link AndroidFlavor} object located at this position in the list

        AndroidFlavor currentAndroidFlavor = getItem(position);

// Find the TextView in the list_item.xml layout with the ID version_name

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);

// Get the version name from the current AndroidFlavor object and set this text on the name TextView

        nameTextView.setText(currentAndroidFlavor.getVersionName());

// Find the TextView in the list_item.xml layout with the ID version_number

     TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);

// Get the version number from the current AndroidFlavor object and set this text on the number

     TextView numberTextView.setText(currentAndroidFlavor.getVersionNumber());

// Find the ImageView in the list_item.xml layout with the ID list_item_icon
     ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

// Get the image resource ID from the current AndroidFlavor object and set image to

     iconView iconView.setImageResource(currentAndroidFlavor.getImageResourceId());

// Return the whole list item layout (containing 2 TextViews and an ImageView)
     // so that it can be shown in the ListView

        return listItemView; }
     }
     */
    //
// My attempt before looking at Android Flavor app. and before watching the video, see link below
/**
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

// Inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word local_word = getItem(position);
        TextView miwokTextView = (TextView) convertView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(local_word.getMiwokTranslation());
        TextView defaultTextView = (TextView) convertView.findViewById(R.id.default_text_view);
        defaultTextView.setText(local_word.getDefaultTranslation());

        return super.getView(position, convertView, parent);
    }
 */
// See https://www.youtube.com/watch?v=C4zSpiZPyXU
// Modified getView based on merging with AndroidFlavors getView
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

    // Inflate the view
    // What if we use convertView instead of listView?
    // may have to add the line below an use the variable listView instead of convertView
    // View listView = convertView;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list

         Word currentWord = getItem(position);

// Find the TextView in the list_item.xml layout with the ID for the Miwok word

        TextView miwokTextView = (TextView) convertView.findViewById(R.id.miwok_text_view);

// Get the version name from the current AndroidFlavor object and set this text on miwokTextView

        miwokTextView.setText(currentWord.getMiwokTranslation());

// Find the TextView in the list_item.xml layout with the ID for the default text word

        TextView defaultTextView = (TextView) convertView.findViewById(R.id.default_text_view);

// Get the default word from the currentWord object and set this text on the defaultTextView

        defaultTextView.setText(currentWord.getDefaultTranslation());

// Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

       // return listItemView;
        return convertView;
    }
}
