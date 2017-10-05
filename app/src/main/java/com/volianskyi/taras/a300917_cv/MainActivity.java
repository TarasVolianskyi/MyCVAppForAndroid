package com.volianskyi.taras.a300917_cv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMyLocation = (Button) findViewById(R.id.btnMyLocation);
        Button btnMyPhoneNumber = (Button) findViewById(R.id.btnMyPhoneNumber);
        Button btnMyEmail = (Button) findViewById(R.id.btnMyEmail);
        Button btnGoToMainList = (Button) findViewById(R.id.btnListOfCategories);
        btnMyLocation.setOnClickListener(this);
        btnMyPhoneNumber.setOnClickListener(this);
        btnMyEmail.setOnClickListener(this);
        btnGoToMainList.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btnMyLocation:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:50.4546600,30.5238000"));
                startActivity(intent);
                break;
            case R.id.btnMyPhoneNumber:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+380974526583"));
                startActivity(intent);
                break;
            case R.id.btnMyEmail:
                intent = new Intent(Intent.ACTION_SENDTO);
                startActivity(intent);
                /*intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("Taras","", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, "My subject");
                intent.putExtra(Intent.EXTRA_TEXT, " My text");
                startActivity(Intent.createChooser(intent,"Send email!"));*/
                break;
            case R.id.btnListOfCategories:


                Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, CategoriesActivity.class);
                intent.putExtra("Number", 15);
                startActivity(intent);
                break;
        }
    }
}
