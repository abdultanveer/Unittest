package com.example.admin.unittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View view) {
        EditText nameEditText = findViewById(R.id.editText);
        String name = nameEditText.getText().toString();
        TextView textView = findViewById(R.id.textView);
        textView.setText(name);
    }
}
