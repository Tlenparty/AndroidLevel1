package com.geekbrain.androidlevel1;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {
    private Button buttonBackActivity;
    private TextView textView2;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        initViews();
        onClickMainActivity();
    }

    private void initViews() {
        textView2 = findViewById(R.id.textView2);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        buttonBackActivity = findViewById(R.id.buttonBackActivity);

    }

    private void onClickMainActivity() {
        buttonBackActivity.setOnClickListener(v -> {
            Intent intent = new Intent(EditTextActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}