package com.ibrickedlabs.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

//need design library
public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomNavigationView=(BottomNavigationView)findViewById(R.id.botomNaviagtion);
        mTextView=(TextView)findViewById(R.id.tv);

        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.favor:
                        mTextView.setText("Favourites");
                        return  true;
                    case  R.id.recents:
                        mTextView.setText("Recents");
                        return  true;
                    case  R.id.nearby:
                        mTextView.setText("Near By");
                        return  true;
                }
                return false;
            }
        });
    }
}
