package com.game.shaik.listexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Word> words= new ArrayList<Word>();

        words.add(new Word("One","Aek"));
        words.add(new Word("two","Aesdfk"));
        words.add(new Word("three","Aesdfk"));
        words.add(new Word("four","Aesdfk"));
        words.add(new Word("five","Asdfek"));
        words.add(new Word("six","Aesdfk"));
        words.add(new Word("seven","Aesdfk"));
        words.add(new Word("eight","Aesfk"));

        WordAdapter itemsAdapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}
