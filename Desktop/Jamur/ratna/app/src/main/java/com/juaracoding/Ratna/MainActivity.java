package com.juaracoding.Ratna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.juaracoding.Ratna.R;

public class MainActivity extends AppCompatActivity{

    EditText txtUsername,txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtUsername.setText("RatnaPujiPratiwi");
        txtPassword.setText("26Rumah");

    }

    public void login(View view){
        String pesan = "Isinya adalah "+ txtUsername.getText().toString() +"  passwordnya adalah "+txtPassword.getText().toString();
        Toast.makeText(MainActivity.this,pesan,Toast.LENGTH_LONG).show();

        Intent nextScreen  = new Intent(MainActivity.this, MainMenu.class);
        nextScreen.putExtra("username",txtUsername.getText().toString());
        nextScreen.putExtra("password",txtPassword.getText().toString());

        startActivity(nextScreen);

    }


}