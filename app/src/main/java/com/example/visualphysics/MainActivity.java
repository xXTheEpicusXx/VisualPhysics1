package com.example.visualphysics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        version = findViewById(R.id.textView);
        version.setText("Версия:" + BuildConfig.VERSION_NAME);
    }

    public void CreateModel(View view) {
        Intent intent = new Intent(MainActivity.this, CreateVisualModel.class);
        startActivity(intent);
    }

    public void OpenSettings(View view) {
        Intent intent=new Intent(MainActivity.this,Settings.class);
        startActivity(intent);
    }

    public void OpenInfo(View view) {
    }
}


