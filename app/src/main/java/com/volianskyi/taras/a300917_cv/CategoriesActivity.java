package com.volianskyi.taras.a300917_cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        getSupportActionBar().setTitle("Categories");
        boolean value = getIntent().getBooleanExtra("Test", true);
        int numberValue = getIntent().getIntExtra("Number", 0);
        TextView tv = (TextView) findViewById(R.id.tvCategories);
        tv.setText("Value is - " + value + "value number - " + numberValue);
        initListView();
    }

    private void initListView() {
        ListView lvListView = (ListView) findViewById(R.id.lvCategoriesListsCategoriesActivity);
        final String[] arrayCategoryList = getResources().getStringArray(R.array.namesOfCategoris);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayCategoryList);
        lvListView.setAdapter(arrayAdapter);
        lvListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(CategoriesActivity.this, "Your choise is - " + arrayCategoryList[i], Toast.LENGTH_SHORT).show();
                if (l > 8 && l < 88) {
                    Intent intent = new Intent(CategoriesActivity.this, MainActivity.class);
                    intent.putExtra("id", l);
                    startActivity(intent);
                } else if (l == 0) {
                    startActivity(new Intent(CategoriesActivity.this, ProfileActivity.class));
                } else if (l == 1) {
                    startActivity(new Intent(CategoriesActivity.this, SkillsActivity.class));
                } else if (l == 2) {
                    startActivity(new Intent(CategoriesActivity.this, ProjectsActivity.class));
                } else if (l == 3) {
                    startActivity(new Intent(CategoriesActivity.this, WorkExperianceActivity.class));
                } else if (l == 4) {
                    startActivity(new Intent(CategoriesActivity.this, EducationActivity.class));
                } else if (l == 5) {
                    startActivity(new Intent(CategoriesActivity.this, LanguagesActivity.class));
                } else if (l == 6) {
                    startActivity(new Intent(CategoriesActivity.this, InterestsActivity.class));
                } else if (l == 7) {
                    startActivity(new Intent(CategoriesActivity.this, QRCodeActivity.class));
                }
            }
        });
    }
}
