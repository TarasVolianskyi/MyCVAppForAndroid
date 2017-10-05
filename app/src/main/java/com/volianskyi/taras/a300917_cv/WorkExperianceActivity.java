package com.volianskyi.taras.a300917_cv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class WorkExperianceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_experiance);
        getSupportActionBar().setTitle("Work experiance");
        initListView();
            }

    private void initListView() {
        ListView lvListView = (ListView) findViewById(R.id.lvWorkExperianceActivity);
        final String[] arrayWorkExperianceList = getResources().getStringArray(R.array.namesOfJobs);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayWorkExperianceList);
        lvListView.setAdapter(arrayAdapter);
        lvListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(WorkExperianceActivity.this, "Your choise is - " + arrayWorkExperianceList[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
