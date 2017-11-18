package com.example.rathana.resourcesdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvHello=(TextView) findViewById(R.id.tvHello);
        tvHello.setText(R.string.home_screen);
        String s =getResources().getString(R.string.home_screen);
        Log.e("text: ",s);

    }
}
