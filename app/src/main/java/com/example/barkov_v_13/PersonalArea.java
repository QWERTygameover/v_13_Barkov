package com.example.barkov_v_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PersonalArea extends AppCompatActivity {

    DBHelper dbh;
    SQLiteDatabase db;

    Button btnSett;
    Button btnCall;
    Button btnExit;

    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_area);
        dbh = new DBHelper(this.getBaseContext());
        db = dbh.getReadableDatabase();
        btnCall = findViewById(R.id.btnCall);
        btnSett = findViewById(R.id.btnSettings);
        btnExit = findViewById(R.id.btnExit);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:+79016714574"));
                startActivity(intent);
            }
        });

        btnSett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Setting();
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Exit();
            }
        });
    }

    public void Setting(){
        Intent intent = new Intent(this, Nastroiki.class);
        startActivity(intent);
    }

    public void Exit(){
        Intent intent = new Intent(this, Avtorizaciya.class);
        startActivity(intent);
    }
}