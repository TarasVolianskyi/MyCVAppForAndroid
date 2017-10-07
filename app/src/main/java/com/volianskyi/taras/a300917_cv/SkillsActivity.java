package com.volianskyi.taras.a300917_cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SkillsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        getSupportActionBar().setTitle("Skills");
      //  onClickBtnGoToListFromThisPage();
    }
/*
    private void onClickBtnGoToListFromThisPage() {
        Button btnGoToMainList = (Button) findViewById(R.id.btnListOfCategories);
        btnGoToMainList.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      //  Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(SkillsActivity.this, CategoriesActivity.class);
        startActivity(intent);
    }*/
}
