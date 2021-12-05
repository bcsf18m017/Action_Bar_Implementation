package com.example.actionbarpractice;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_settings:
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                    break;
            case R.id.action_favorite:
                    Toast.makeText(getApplicationContext(),"Fav", Toast.LENGTH_LONG).show();
                    break;
            case R.id.action_tasks:
                    TextView textView = findViewById(R.id.textView3);
                    textView.setText("Action task was clicked");
                    break;
                default:
                    return super.onOptionsItemSelected(item);
        }
        return true;
    }
}