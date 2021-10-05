package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonTraduir;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = (TextView) findViewById(R.id.helloWorld);
        buttonTraduir = (Button)findViewById(R.id.buttonTraduir);
        buttonTraduir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { message.setText("Hola Mooon!!!:)");

            }
        });


    }

}