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

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;      //new line added to support ListView

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_family);  // replace with line below after refactoring
        setContentView(R.layout.word_list);
        // Use the Word class object which uses 2 strings
// Create an array list of words based on the word class
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father", "әpә"));
        words.add(new Word("Mother", "әta"));
        words.add(new Word("Son", "angsi"));
        words.add(new Word("Daughter", "tune"));
        words.add(new Word("Older brother", "taachi"));
        words.add(new Word("Younger brother", "chalitti"));
        words.add(new Word("Older sister", "tete"));
        words.add(new Word("Younger sister", "kolliti"));
        words.add(new Word("Grandmother", "ama"));
        words.add(new Word("Grandfather", "paapa"));


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
