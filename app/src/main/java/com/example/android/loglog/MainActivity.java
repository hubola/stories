package com.example.android.loglog;


import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView textViewFirstItem = findViewById(R.id.menu_item_1);
                String FirstMenuItem = textViewFirstItem.getText().toString();
                        Log.v("MainActivity",FirstMenuItem);
        // Find second menu item TextView and print the text to the logs
        TextView textViewSecondItem = findViewById(R.id.menu_item_2);
        String SecMenuItem = textViewSecondItem.getText().toString();
        Log.v("MainActivity",SecMenuItem);
        // Find third menu item TextView and print the text to the logs
        TextView textViewThirdItem = findViewById(R.id.menu_item_3);
        String ThirdMenuItem = textViewThirdItem.getText().toString();
        Log.v("MainActivity",ThirdMenuItem);
    }
}