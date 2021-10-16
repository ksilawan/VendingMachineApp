package com.demo.vendingmachine;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText enteredAmount = (EditText) findViewById(R.id.tvuseramount);

        Button insertMoney = (Button) findViewById(R.id.btninsertmoney);
        Button buyCoke = (Button) findViewById(R.id.btncoke);
        Button buySprite = (Button) findViewById(R.id.btnsprite);
        Button buyIcedTea = (Button) findViewById(R.id.btnicedtea);
        Button buyRoyal = (Button) findViewById(R.id.btnroyal);
    }
}