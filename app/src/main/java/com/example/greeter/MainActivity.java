package com.example.greeter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnGreet;
    EditText etxNombre;
    TextView tvSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGreet = (Button)findViewById(R.id.greetButton);
        etxNombre = (EditText)findViewById(R.id.greetEditText);
        tvSaludo = (TextView)findViewById(R.id.messageTextView);

        btnGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSaludo.setText("Hello, " + etxNombre.getText().toString() + "!");
            }
        });

    }
}
