package com.volianskyi.taras.a300917_cv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickGoToMyLocation(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:50.4546600,30.5238000"));
        startActivity(intent);
    }

    public void clickGoToMyEmail (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(intent);
    }

    public void clickGoToMyPhoneNumber(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+380974526583"));
        startActivity(intent);
    }

}
