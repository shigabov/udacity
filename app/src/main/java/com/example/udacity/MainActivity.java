package com.example.udacity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void justText (View v) {
        switch (v.getId()) {
            case R.id.btn_spotify:
                Toast.makeText(getApplicationContext(), "This button will lunch SPOTIFY app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_scores:
                Toast.makeText(getApplicationContext(), "This button will lunch SCORES app!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_library:
                Toast.makeText(getApplicationContext(), "This button will lunch LIBRARY app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_bib:
                Toast.makeText(getApplicationContext(), "This button will lunch BUILD IT BIGGER app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_xyz:
                Toast.makeText(getApplicationContext(), "This button will lunch XYZ READER app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_capstone:
                Toast.makeText(getApplicationContext(), "This button will lunch my own app!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;

        }
    }
}
