package com.volianskyi.taras.a300917_cv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //@Override
    public void onClick(View view) {
        Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ListActivity.class);
        intent.putExtra("Test", true);
        intent.putExtra("Number", 15);
        startActivity(intent);
    }

    public void clickGoToMyLocation(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:50.4546600,30.5238000"));
        startActivity(intent);
    }

    public void clickGoToMyEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(intent);
    }

    public void clickGoToMyPhoneNumber(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+380974526583"));
        startActivity(intent);
    }

}
