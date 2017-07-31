package com.example.azurlanedemo;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayKantai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_kantai);

        Intent intent = getIntent();
        RowItem item = (RowItem)intent.getSerializableExtra(MainActivity.EXTRA_KANTAI);

        TextView textView = (TextView)findViewById(R.id.kantai_Detail);
        textView.setText(item.getKantaiName());
    }
}
