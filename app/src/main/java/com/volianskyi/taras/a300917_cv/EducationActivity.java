package com.volianskyi.taras.a300917_cv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class EducationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        getSupportActionBar().setTitle("Education");
        initListView();
    }

    private void initListView() {
        ListView lvListView = (ListView) findViewById(R.id.lvEducationActivity);
        final String[] arrayEducationList = getResources().getStringArray(R.array.namesOfUniversities);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayEducationList);
        lvListView.setAdapter(arrayAdapter);
        lvListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(EducationActivity.this, "Your choise is - " + arrayEducationList[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}