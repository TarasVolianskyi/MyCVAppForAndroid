package com.volianskyi.taras.a300917_cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LanguagesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);
        getSupportActionBar().setTitle("Languages");
        initListView();
    }

    private void initListView() {
        ListView lvListView = (ListView) findViewById(R.id.lvLanguagesActivity);
        final String[] arrayLanguagesList = getResources().getStringArray(R.array.namesOfLanguages);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayLanguagesList);
        lvListView.setAdapter(arrayAdapter);
        lvListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(LanguagesActivity.this, "Your choise is - " + arrayLanguagesList[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}