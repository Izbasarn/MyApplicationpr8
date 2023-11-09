package com.example.myapplicationpr8;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView main_text = findViewById(R.id.main_text);
        Button btn_second = findViewById(R.id.btn_second);
        Button button2 = findViewById(R.id.button2);
        Button button4 = findViewById(R.id.button4);
        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfo(main_text.getText().toString());

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfo(button2.getText().toString());

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfo(button4.getText().toString());

            }
        });
    }

    public void btnClick (View v) {
        showInfo(((Button) v).getText().toString());

    }

    private void showInfo(String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}