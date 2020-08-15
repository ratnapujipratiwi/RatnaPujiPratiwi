package com.juaracoding.Ratna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.juaracoding.Ratna.R;

public class MainMenu extends AppCompatActivity {

    String username, password;
    TextView txtUsername;
    ImageView btnTambahData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        txtUsername = findViewById(R.id.txtUsername);
        btnTambahData = findViewById(R.id.btnTambahData);
        username = getIntent().getStringExtra("username");
        password = getIntent().getStringExtra("password");



        txtUsername.setText(username);
    }

    public void screenTambahData(View view){
        Intent intent = new Intent(MainMenu.this,TambahData.class);
        startActivity(intent);

    }

    public void screenListData(View view){
        Intent intent = new Intent(MainMenu.this,ListBiodata.class);
        startActivity(intent);

    }


}