package com.example.vaishnavi.dwas123;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Login extends AppCompatActivity {
    private TextInputLayout textInputMobile;
    private TextInputLayout textInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInputMobile=findViewById(R.id.text_input_mobile);
        textInputPassword=findViewById(R.id.text_input_password);
    }
}
