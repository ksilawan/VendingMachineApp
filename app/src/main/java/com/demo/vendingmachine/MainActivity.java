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
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();

        TextView currentAmountEntered = (TextView) findViewById(R.id.tvtxtdisplaymoney);
        TextInputEditText enteredAmount = (TextInputEditText) findViewById(R.id.edttxtuseramounted);

        Button insertMoney = (Button) findViewById(R.id.btninsertmoney);
        Button buyCoke = (Button) findViewById(R.id.btncoke);
        Button buySprite = (Button) findViewById(R.id.btnsprite);
        Button buyIcedTea = (Button) findViewById(R.id.btnicedtea);
        Button buyRoyal = (Button) findViewById(R.id.btnroyal);

        buyCoke.setEnabled(false);
        buyIcedTea.setEnabled(false);
        buyRoyal.setEnabled(false);
        buySprite.setEnabled(false);

        insertMoney.setOnClickListener(new View.OnClickListener() {
            float currentAmount = 0;
            @Override
            public void onClick(View view) {
                float amount = Float.parseFloat(enteredAmount.getText().toString());

                if(amount > 100){
                    Toast.makeText(context, "Max amount accepted is 100.00", Toast.LENGTH_SHORT).show();
                }
                else if(amount <= 0){
                    Toast.makeText(context, "Min amount accepted is 1.00", Toast.LENGTH_SHORT).show();
                }
                else{
                    float updatedAmount = currentAmount += amount;
                    currentAmountEntered.setText("Current Money: " + updatedAmount);
                }

                if(currentAmount >= 50){
                    buyCoke.setEnabled(true);
                }

                if(currentAmount >= 60){
                    buySprite.setEnabled(true);
                }

                if(currentAmount >= 70){
                    buyRoyal.setEnabled(true);
                }

                if(currentAmount >= 80) {
                    buyIcedTea.setEnabled(true);
                }
            }
        });

        buyCoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Enjoy your coke", Toast.LENGTH_SHORT).show();
            }
        });

        buySprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buyIcedTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buyRoyal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}