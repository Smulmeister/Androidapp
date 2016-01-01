package com.example.mauritsm.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class User extends AppCompatActivity {

    private static Button uitloggen_btn;
    private static Button voorkeuren_btn;
    private static Button zoek_btn;
    private static Button instellingen_btn;
    private static Button resultaten_btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        loguitButton();
        resultatenbutton();
        accountbutton();
        voorkeurenbutton();
        zoekbutton();
    }

    public void loguitButton() {
        uitloggen_btn = (Button) findViewById(R.id.btn_uitloggen);

        uitloggen_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(User.this, "U bent weer terug bij login scherm", Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(User.this,Login.class);
                        startActivity(intent1);
                    }
                }
        );
    }
    public void resultatenbutton() {
        resultaten_btn = (Button) findViewById(R.id.button_resultaten);

        resultaten_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(User.this, "resultaten worden weergeven", Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(User.this,resultaten.class);
                        startActivity(intent1);
                    }
                }
        );
    }
    public void accountbutton() {
        instellingen_btn = (Button) findViewById(R.id.button_account);

        instellingen_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(User.this, "Instellingen worden weergeven", Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(User.this,instellingen.class);
                        startActivity(intent1);
                    }
                }
        );
    }
    public void voorkeurenbutton() {
        voorkeuren_btn = (Button) findViewById(R.id.button_voorkeuren);

        voorkeuren_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(User.this, "Voorkeuren worden weergeven", Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(User.this,voorkeuren.class);
                        startActivity(intent1);
                    }
                }
        );
    }

    public void zoekbutton() {
        zoek_btn = (Button) findViewById(R.id.button_zoek);

        zoek_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(User.this, "Zoek student wordt weergeven", Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(User.this,zoek.class);
                        startActivity(intent1);
                    }
                }
        );
    }
}

