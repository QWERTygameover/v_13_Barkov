package com.example.barkov_v_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Avtorizaciya extends AppCompatActivity {

    EditText etLogin;
    EditText etPassword;

    Button btnLogin;

    DBHelper dbh;

    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avtorizaciya);
        etLogin = findViewById(R.id.ptLogin);
        etPassword = findViewById(R.id.ptLogin2);
        btnLogin = findViewById(R.id.btnLogin);
        dbh = new DBHelper(this.getBaseContext());
        db = dbh.getWritableDatabase();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login();
            }
        });
    }

    public void Login(){
        Intent intent = new Intent(this, PersonalArea.class);

        ContentValues cv = new ContentValues();

        cv.put("LOGIN", etLogin.getText().toString());
        cv.put("PASSWORD", etPassword.getText().toString());

        db.insert("USER", null, cv);

        startActivity(intent);
    }
}