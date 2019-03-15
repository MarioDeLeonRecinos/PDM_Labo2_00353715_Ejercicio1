package com.Mario.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText nombre,password;

    TextView show1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        nombre = findViewById(R.id.namenombre);
        password = findViewById(R.id.pass);
        show1 = findViewById(R.id.shownombre);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                show1.setText(nombre.getText());
            }
        });
        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                show1.setText(password.getText());
                return true;
            }
        });
    }

}
