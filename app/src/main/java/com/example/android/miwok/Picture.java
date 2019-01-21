package com.example.android.miwok;

import android.media.Image;

public class Picture {
    /** Image URL of the picture */
 //   private String mImgURL;  //deprecated in favor of a mImgResoureID
    private int mImgResourceId;

    /** Miwok translation for the picture */
    private String mMiwok_ImageText;


    public Picture(int mImgResourceId, String mMiwok_ImageText) {
        this.mImgResourceId = mImgResourceId;
        this.mMiwok_ImageText = mMiwok_ImageText;
    }


    public int getmImgResourceId() {
        return mImgResourceId;
    }

    public String getmMiwok_ImageText() {
        return mMiwok_ImageText;
    }
}


