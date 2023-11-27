package com.example.islandtreasurehuntv11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class createGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        EditText email = (EditText) findViewById(R.id.etTextEmailAddress);

        Button btn = findViewById(R.id.btnPayment);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().trim().length() <= 0 || !email.getText().toString().contains("@"))  {
                    Toast.makeText(createGame.this, "Please enter valid Email Address",Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    int code = new Random().nextInt(1000000);
                }
            }
        });
    }
}