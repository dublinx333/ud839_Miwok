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
import java.util.ArrayList;
import android.widget.ListView;      //new line added to support ListView

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_colors);// replace with line below after refactoring
        setContentView(R.layout.word_list);

// Use the Word class object which uses 2 strings
// Create an array list of words based on the word class
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "wetetti"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "takaakki"));
        words.add(new Word("gray", "topoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));
        words.add(new Word("dusty yellow", "topiisә"));
        words.add(new Word("mustard yellow", "chiwiitә"));

// Create the a new WordAdapter object.
// Make sure the constructor (in the WordAdapter.java file)
// Ex: public WordAdapter(Context context, ArrayList<Word> objects) {}
// matches the parameters to create a new object
// Ex: new WordAdapter(this, words)

        WordAdapter adapter = new WordAdapter(this, words);

// Added the line below because I was getting a null reference

        setContentView(R.layout.word_list);
        ListView listView = (ListView) findViewById(R.id.list);

//Attach the adapter to the view

        listView.setAdapter(adapter);

    }
}
