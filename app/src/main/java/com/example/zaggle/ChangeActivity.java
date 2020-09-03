package com.example.zaggle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class ChangeActivity extends AppCompatActivity {

    TextView textCountDown;

    public void home(View view){
        Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        textCountDown = (TextView) findViewById(R.id.textCountdown);
        new CountDownTimer(60000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textCountDown.setText("00:"+ millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                textCountDown.setText("00:00");
            }
        }.start();
    }
}
