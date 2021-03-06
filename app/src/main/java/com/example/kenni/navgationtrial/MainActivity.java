package com.example.kenni.navgationtrial;

import android.content.ClipData;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerlayout;
    private ActionBarDrawerToggle mToggle;
    private Button buttonlogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonlogin = findViewById(R.id.buttonlogin);

          buttonlogin.setOnClickListener(new View.OnClickListener() {
          @Override
         public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,Login.class);
        startActivity(intent);
    }
        });

        mDrawerlayout=findViewById(R.id.drawer);
        mToggle=new ActionBarDrawerToggle(this,mDrawerlayout,R.string.open,R.string.close);
        mDrawerlayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if (mToggle.onOptionsItemSelected(item));
        {
            return true;
        }

    }
}
