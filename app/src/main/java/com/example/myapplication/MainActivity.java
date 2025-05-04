package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextEmail, editTextPassword;
    Button buttonContinue;
    String email="hello@gmail.com", password="abcd", strEmail, strpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEmail = findViewById(R.id.edtEmail);
        editTextPassword = findViewById(R.id.edtPassword);
        buttonContinue = findViewById(R.id.btnContinue);
        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strEmail=editTextEmail.getText().toString().trim();
                strpass=editTextPassword.getText().toString().trim();
                if (email.equals(strEmail) && password.equals(strpass)) {
                    Intent intent = new Intent(MainActivity.this, Layout2Activity.class); // move to next layout
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}