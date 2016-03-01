package com.example.aparna.wireframes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.aparna.wireframes.activities.ChatActivity;
import com.example.aparna.wireframes.activities.CommunityActivity;
import com.example.aparna.wireframes.activities.MapActivity;
import com.example.aparna.wireframes.activities.ProfileActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    public void onProfileView(MenuItem item) {
        Intent i = new Intent(this, ProfileActivity.class);
        startActivity(i);
    }

    public void onMapView(MenuItem item) {
        Intent i = new Intent(this, MapActivity.class);
        startActivity(i);
    }

    public void onCommunityView(MenuItem item) {
        Intent i = new Intent(this, CommunityActivity.class);
        startActivity(i);
    }

    public void onChatsView(MenuItem item) {
        Intent i = new Intent(this, ChatActivity.class);
        startActivity(i);
    }
}
