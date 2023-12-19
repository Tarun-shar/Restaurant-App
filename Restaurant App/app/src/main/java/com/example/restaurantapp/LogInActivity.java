package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.restaurantapp.databinding.ActivityLogInBinding;

public class LogInActivity extends AppCompatActivity {

    private ActivityLogInBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLogInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = binding.emailEditText.getText().toString();
                String password = binding.passwordEditText.getText().toString();

                if(userName.isEmpty() && password.isEmpty()){
                        Toast.makeText(LogInActivity.this, "Please fill the all fields!", Toast.LENGTH_SHORT).show();
                }
                else if(userName.isEmpty()){
                    Toast.makeText(LogInActivity.this, "Please fill UserName field!", Toast.LENGTH_SHORT).show();
                }
                else if(password.isEmpty()){
                    Toast.makeText(LogInActivity.this, "Please fill Password field!", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(password.length()<8){
                        Toast.makeText(LogInActivity.this, "Password must be 8 digits", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Intent intent = new Intent(LogInActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }

                }
            }
        });
    }
}