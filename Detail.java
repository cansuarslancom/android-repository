package com.example.cansu.liste_ornegi;

import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Detail extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        Bundle bundle = getIntent().getExtras();
        String value = bundle.getString("key");
        TextView textView = new TextView(this);
        textView.setText(value);
        setContentView(textView);
    }
}
