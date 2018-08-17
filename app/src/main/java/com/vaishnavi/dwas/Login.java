package com.vaishnavi.dwas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ProfileFragment;

public class Login extends AppCompatActivity {
    public static final String EXTRA_NUMBER = "com.vaishnavi.dwas.EXTRA_NUMBER";
    public static final String EXTRA_TEXT = "com.vaishnavi.dwas.EXTRA_TEXT";
    private TextInputLayout textInputMobile;
    private TextInputLayout textInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInputMobile=findViewById(R.id.text_input_mobile);
        textInputPassword=findViewById(R.id.text_input_password);

        Button btn6 = (Button) findViewById(R.id.button);

        btn6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent1 = new Intent(Login.this, Register.class);
                startActivity(intent1);
                Login.this.finish();

            }

        });
        Button btn1 = (Button) findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v1) {
                Intent intent2 = new Intent(Login.this, Home.class);
                startActivity(intent2);
                Login.this.finish();
            }
        });

    }

    public void openProfileFragment() {
        TextInputLayout text = (TextInputLayout) findViewById(R.id.text_input_mobile);
        int number = Integer.parseInt(text.getEditText().toString());

        TextInputLayout text1 = (TextInputLayout) findViewById(R.id.text_input_password);
        String text2 = text1.getEditText().toString();

        Intent intent = new Intent(this, ProfileFragment.class);
        intent.putExtra(EXTRA_NUMBER, number);
        intent.putExtra(EXTRA_TEXT, text2);
        startActivity(intent);
    }

}
