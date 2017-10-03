package com.volianskyi.taras.a300917_cv;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        boolean value = getIntent().getBooleanExtra("Test", true);
        int numberValue = getIntent().getIntExtra("Number", 0);
        TextView tv = (TextView) findViewById(R.id.tvTextMapsActivity);
        //tv.setText("Value is - " + value + "value number - " + numberValue);
        ListView lvMain = (ListView) findViewById(R.id.lvListOfCategories);
        //final String[] array = new String[]{"one","two","three"};
        final String[] array = getResources().getStringArray(R.array.namesOfCategoris);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);
        lvMain.setAdapter(arrayAdapter);
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListActivity.this, "click on item" + array[i], Toast.LENGTH_SHORT).show();
            }
        });
    }

}