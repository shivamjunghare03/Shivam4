package com.example.shivam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText id,pass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id = (EditText)findViewById(R.id.id);
        pass = (EditText)findViewById(R.id.pass);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if((id.getText().toString().equals("admin"))&&(pass.getText().toString().equals("12345"))) {
                Toast.makeText(MainActivity.this, "Successfully logged in", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, school.class);
                startActivity(intent);
            } else    {
                    Toast.makeText(MainActivity.this, " log in failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
