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
//import android.util.Log;
//import android.view.TextureView;
//import android.widget.GridView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//import android.view.LayoutInflater;


import java.util.ArrayList;
//import android.widget.ArrayAdapter;  //new line added to support ArrayAdapter
import android.widget.ListView;      //new line added to support ListView

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Replace the word_list layout with the new list_item layout
         * etContentView(R.layout.word_list);
         * */
//       setContentView(R.layout.list_item);// replace with line below after refactoring
        setContentView(R.layout.word_list); // see word_list.xml (which has a id of "list"
//        int index = 0;  //while loop for adding words
//        String theword ="x";


        /** Replace code for using a string of words with code using
         *  a word class
         *  From: ArrayList<String> words = new ArrayList<String>();
         *  To:   ArrayList<Word> words = new ArrayList<Word>();
         *
         *  Replace the array of stings with an array of word objects

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

         NOTE: At one point we could have had something like

         ArrayList<Word> words = new ArrayList<Word>();
         words.add(new Word("one", "lutti"));
         words.add(new Word("two", "otiiko"));
         words.add(new Word("three", "tolookosu"));
         words.add(new Word("four", "oyyisa"));
         words.add(new Word("five", "massokka"));
         words.add(new Word("six", "temmokka"));
         words.add(new Word("seven", "kenekaku"));
         words.add(new Word("eight", "kawinta"));
         words.add(new Word("nine", "wo’e"));
         words.add(new Word("ten", "na’aacha"));

         But creating an array of words based on the Word object (in Word.java) seemed like a bitch'in idea
         so we did this instead

         */

        // New code to use the Word class object which uses 2 strings
        // Create an array list of words based on the word class
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "dutti"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));


        // Version 1: iterate via 'for loop
        // System.out.println("\n==> Advanced For Loop Example..");
        // for (String theword : words) {
         //   System.out.println(theword);
        //    Log.d ( "Numbers Activity", theword) ;
        // }
        // Create a new Text view Called wordView using the rootView (i.e. this)

        // sk removed for ArrayAdapter - LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        // TextView wordView = new TextView(this);

        // Version 1: Use a for loop to add new text to the view

        //for (index = 0; index < words.size(); index++){
        //    TextView wordView = new TextView(this); //create child view
        //    wordView.setText(words.get(index)); //add text to child view
        //    rootView.addView(wordView);  //add child view to the parent
        //}

        //Version 2: iterate via a while loop to add text to the view

        // while (index < words.size()) {
        //    TextView wordView = new TextView(this); //create child view
        //    wordView.setText(words.get(index)); //add text to child view
        //    rootView.addView(wordView);  //add child view to the parent
        //    index++;
        // }


        // Version 3. Replace for loop with an Array Adapter

        // Version 3a. using a list view.  (Don't use rootView) of words

        // ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        // Replace list view with grid view on the ArrayAdapter

        // ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        // GridView gridView = (GridView) findViewById(R.id.gridview);

        // gridView.setAdapter(itemsAdapter);

        // Version 3b. Replace ArrayAdapter which used a single string to use a Word class object
        //Version 3. Replace ArrayAdapter with a new class called WordAdapter
        // based on our WorAdapter.java class which extended ArrayAdapter


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      // ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, android.R.layout.list_item, words);

        // Create the a new WordAdapter object.
        // Make sure the constructor (in the WordAdapter.java file)
        // Ex: public WordAdapter(Context context, ArrayList<Word> objects) {}
        // matches the parameters to create a new object (Ex: new WordAdapter(this, words))

        WordAdapter adapter = new WordAdapter(this, words);

        // Added the line below because I was getting a null reference
        setContentView(R.layout.word_list);
        ListView listView = (ListView) findViewById(R.id.list);


        // Version 2 code - Use itemsAdapter
        // listView.setAdapter(itemsAdapter);

        // Version 3 code - use WordAdapter
        // Error getting null object reference on the line below so I modified the
        // code on creating the listView object above

        listView.setAdapter(adapter);


    }
}
