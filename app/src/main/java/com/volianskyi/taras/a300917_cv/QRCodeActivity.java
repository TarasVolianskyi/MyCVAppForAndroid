package com.volianskyi.taras.a300917_cv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class QRCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);
        getSupportActionBar().setTitle("QR-Code");
    }
}
