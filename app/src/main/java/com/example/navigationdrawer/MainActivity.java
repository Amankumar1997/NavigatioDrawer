package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
NavigationView navigationView;
ActionBarDrawerToggle toggle;
DrawerLayout dw;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView=(NavigationView)findViewById(R.id.navigationview);
        dw=(DrawerLayout)findViewById(R.id.drawerlayout);

        toggle=new ActionBarDrawerToggle(this,dw,toolbar,R.string.open,R.string.close);

        dw.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "home panel is open", Toast.LENGTH_SHORT).show();
                        dw.closeDrawer(GravityCompat.START);
                        break;
                        case R.id.call:
                        Toast.makeText(MainActivity.this, "call panel is open", Toast.LENGTH_SHORT).show();
                        dw.closeDrawer(GravityCompat.START);
                        break;
                        case R.id.setting:
                        Toast.makeText(MainActivity.this, "setting panel is open", Toast.LENGTH_SHORT).show();
                        dw.closeDrawer(GravityCompat.START);
                        break;
                }


                return true;
            }
        });
    }
}