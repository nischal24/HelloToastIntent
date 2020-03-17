package com.example.hellotoastintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button countButton,toastButton;
    private TextView textView;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countButton=findViewById(R.id.countButton);
        toastButton=findViewById(R.id.toastButton);
        textView=findViewById(R.id.textView);
        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                textView.setText(Integer.toString(count));
            }
        });

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a= textView.getText().toString();
                int value=Integer.parseInt(a);
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("NUMBER",value+"");
                startActivity(intent);
            }
        });
    }
}
