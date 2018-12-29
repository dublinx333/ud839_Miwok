/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.TextureView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;
import android.widget.ArrayAdapter;  //new line added to support ArrayAdapter
import android.widget.ListView;      //new line added to support ListView

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        int index = 0;  //while loop for adding words
        // String theword ="x";


        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.add("eleven");

        // iterate via "New way to loop"
        // System.out.println("\n==> Advanced For Loop Example..");
        // for (String theword : words) {
         //   System.out.println(theword);
        //    Log.d ( "Numbers Activity", theword) ;
        // }
        // Create a new Text view Called wordView using the rootView (i.e. this)

        // sk removed for ArrayAdapter - LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        // TextView wordView = new TextView(this);

        // use a while loop to add text to the view
        // while (index < words.size()) {
        //    TextView wordView = new TextView(this); //create child view
        //    wordView.setText(words.get(index)); //add text to child view
        //    rootView.addView(wordView);  //add child view to the parent
        //    index++;
        // }

        // Use a for loop to add new text to the view
        //for (index = 0; index < words.size(); index++){
        //    TextView wordView = new TextView(this); //create child view
        //    wordView.setText(words.get(index)); //add text to child view
        //    rootView.addView(wordView);  //add child view to the parent
        //}


        // Replaced for loop above with an array adapter.  Don't use rootView
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}
