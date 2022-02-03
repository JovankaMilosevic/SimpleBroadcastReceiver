/*
* @author Jovanka Milosevic
* */

package com.milosevicj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.milosevicj.MyReceiver;

public class MainActivity extends AppCompatActivity {

    Button btnBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btnBroadcast = (Button)findViewById(R.id.btnBroadcast);


        btnBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeBtnColor(view);
                sendNewBroadcast(view);
            }
        });


    }

    public void changeBtnColor(View view) {
        ((Button)view).setBackgroundColor(Color.LTGRAY);
        ((Button)view).setTextColor(Color.BLACK);
    }

    public void sendNewBroadcast(View view){
        Intent intent = new Intent(this, MyReceiver.class);
        intent.setAction("com.milosevicj.broadcastMessage");
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(intent);
        System.out.println("Broadcast message sent.");
    }
}