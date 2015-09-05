package com.example.root.hello_this_is_me;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.root.hello_this_is_me.R.id.textView1;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** This is how we add a text using code **/
        String name="1. Amrita-U SN 719 Android Security - Melvin Varkey";
        TextView txtview = (TextView)findViewById(textView1);
        txtview.setText(name);

        Button next = (Button)findViewById(R.id.next1);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
