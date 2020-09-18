package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b;
EditText E;
  


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.hButton);
        E = (EditText) findViewById(R.id.personName);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = E.getText().toString();
                sendDate(s);
                


            }
        });

    }

    private void sendDate(String s) {
        Intent intent = new Intent(this , HelloActiviy.class);
        String name;
        intent.putExtra( name : "personName" , s);
        startActivity(intent);
    }
}
