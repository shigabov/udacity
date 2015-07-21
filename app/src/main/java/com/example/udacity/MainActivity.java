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


    public void justText (View v) {
        switch (v.getId()) {
            case R.id.btn_spotify:
                Toast.makeText(getApplicationContext(), R.string.spotify, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_scores:
                Toast.makeText(getApplicationContext(), R.string.scores, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_library:
                Toast.makeText(getApplicationContext(), R.string.library, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_bib:
                Toast.makeText(getApplicationContext(), R.string.bib, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_xyz:
                Toast.makeText(getApplicationContext(),  R.string.xyz, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_capstone:
                Toast.makeText(getApplicationContext(),  R.string.capstone, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;

        }
    }
}
