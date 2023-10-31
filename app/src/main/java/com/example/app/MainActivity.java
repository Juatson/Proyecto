package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Registrase, Iniciarsesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Registrase=findViewById(R.id.Registrase);
        Iniciarsesion=findViewById(R.id.Iniciarsesion);

        Intent second = new Intent(getApplicationContext(),com.example.myapplication.pprincipal.class);

        Iniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(second);
            }
        });

    }
}