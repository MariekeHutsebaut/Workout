package com.hfad.workout;

import android.content.*;
import android.view.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowDetails(View view){
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}