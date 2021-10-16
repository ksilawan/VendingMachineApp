package com.demo.vendingmachine;


import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();

        //TextInputEditText enteredAmount = (TextInputEditText) findViewById(R.id.tvuseramount);

        Button insertMoney = (Button) findViewById(R.id.btninsertmoney);
        Button buyCoke = (Button) findViewById(R.id.btncoke);
        Button buySprite = (Button) findViewById(R.id.btnsprite);
        Button buyIcedTea = (Button) findViewById(R.id.btnicedtea);
        Button buyRoyal = (Button) findViewById(R.id.btnroyal);

        //buyCoke.setEnabled(false);

        buyCoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Enjoy your coke", Toast.LENGTH_SHORT).show();
            }
        });
    }
}