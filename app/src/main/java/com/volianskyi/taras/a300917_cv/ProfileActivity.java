package com.volianskyi.taras.a300917_cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        TextView tvTitle = (TextView) findViewById(R.id.tvProfileTitle);
        TextView tvContent = (TextView) findViewById(R.id.tvProfileContent);
    }

    public void clickGoBakToList(View view) {
        //Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ListActivity.class);
        // intent.putExtra("Test", true);
        //intent.putExtra("Number", 15);
        startActivity(intent);
    }
}
