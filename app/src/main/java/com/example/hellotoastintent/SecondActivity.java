package com.example.hellotoastintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private Button returnButton;
    private TextView counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        returnButton=findViewById(R.id.returnButton);
        counter=findViewById(R.id.CounterValue);
        Intent intent=getIntent();
        String count=intent.getStringExtra("NUMBER");
        counter.setText(count);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
