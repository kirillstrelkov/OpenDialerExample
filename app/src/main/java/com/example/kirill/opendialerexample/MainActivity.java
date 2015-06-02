package com.example.kirill.opendialerexample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDialer(View view) {
        Uri number = Uri.parse("tel:");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(Intent.createChooser(callIntent, "Calling"));
    }
}
