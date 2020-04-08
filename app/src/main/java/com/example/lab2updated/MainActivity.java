package com.example.lab2updated;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void myClickHandler(View view) {
        TextView txtV = (TextView) findViewById(R.id.textView);
        switch (View.getId()) {
            case R.id.button1:
                txtV.setTextColor(Color.RED);
                break;
            case R.id.button2:
                txtV.setTextColor(Color.GREEN);
                break;
            case R.id.button3:
                txtV.setTextColor(Color.BLUE);
                break;
            default:
        }
    }
    public void setButtonOnClickListener() {
        Button buttonRed = (Button) findViewById(R.id.button1);
        Button buttonGreen = (Button) findViewById(R.id.button2);
        Button buttonBlue = (Button) findViewById(R.id.button3);

        View.OnClickListener myClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClickHandler(view);
            }
        };
        buttonRed.setOnClickListener(myClickListener);
        buttonGreen.setOnClickListener(myClickListener);
        buttonBlue.setOnClickListener(myClickListener);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener((view) {
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        };

        setButtonsClickListener();
    }
}
