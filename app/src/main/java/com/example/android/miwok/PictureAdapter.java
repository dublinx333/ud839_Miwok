package com.example.android.miwok;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView; //support image view object methods
import java.util.ArrayList;

public class PictureAdapter extends ArrayAdapter <Picture>  {

    public PictureAdapter(Context context, ArrayList<Picture> pictures){
        //
        super(context,0,pictures);

    }


    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


// Inflate the view

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.picture_item, parent, false);
        }
        // Get the picture object located at this position in the list

        Picture currentPicture = getItem(position);

// Find the ImageView in the picture_item.xml layout with the ID for the Miwok picture

        ImageView  pictureView = (ImageView) convertView.findViewById(R.id.miWok_image);
        pictureView.setImageResource(currentPicture.getmImgResourceId());

// Get the image resource ID from the current AndroidFlavor object and
// set the image to iconView iconView.setImageResource(currentAndroidFlavor.getImageResourceId());


// Find the TextView in the picture_item.xml layout with the ID for the default text word

        TextView miWokTextView = (TextView) convertView.findViewById(R.id.miWok_image_text);

// Get the default word from the currentWord object and set this text on the defaultTextView

        miWokTextView.setText(currentPicture.getmMiwok_ImageText());

// Return the whole list item layout (containing 2 TextViews and an ImageView)
// so that it can be shown in the ListView

//              return listItemView;
        return convertView;

    }

}
