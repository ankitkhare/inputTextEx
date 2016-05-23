package com.ak.inputtextexample;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout mInputLayout;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInputLayout = (TextInputLayout) findViewById
                (R.id.input_layout);
        mEditText = (EditText) findViewById(R.id.editText);

    }

    public void checkFieldValidity(View view) {
        if (TextUtils.isEmpty(mEditText.getText().toString().trim())) {
            mInputLayout.setErrorEnabled(true);
            mInputLayout.setError("Field Is Empty");
        } else {
            mInputLayout.setErrorEnabled(false);
        }
    }
}
