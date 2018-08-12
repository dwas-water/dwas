package com.vaishnavi.dwas;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity implements ExampleDialog.ExampleDialogListener{
     private TextView textViewAddress;
     private TextInputLayout textInputName;
     private TextInputLayout textInputMobile;
     private TextInputLayout textInputPassword;

    public Register(TextView textViewAddress) {
        this.textViewAddress = textViewAddress;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        textInputName=findViewById(R.id.text_input_name);
        textInputMobile=findViewById(R.id.text_input_mobile);
        textInputPassword=findViewById(R.id.text_input_password);

        textViewAddress=(TextView)findViewById(R.id.textview_address);
        textViewAddress.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                openDialog();

            }
        });
    }
    private boolean validateName() {
        String nameInput=textInputName.getEditText().getText().toString().trim();

        if(nameInput.isEmpty()) {
            textInputName.setError("Field can't be empty");
            return false;
        }
        else {
            textInputName.setError(null);
            textInputName.setErrorEnabled(false);
            return true;
        }
    }
    private boolean validateAddress() {
        String addressInput=textViewAddress.getText().toString().trim();

        if(addressInput.isEmpty()) {
            textViewAddress.setError("Field can't be empty");
            return false;
        }
        else {
            textViewAddress.setError(null);
            return true;
        }


    }
    private boolean validatePassword() {
        String passwordInput=textInputPassword.getEditText().getText().toString().trim();

        if(passwordInput.isEmpty()) {
            textInputPassword.setError("Field can't be empty");
            return false;
        }
        else {
            textInputPassword.setError(null);
            textInputPassword.setErrorEnabled(false);
            return true;
        }


    }
    public void registerInput(View v)
    {
        if(!validateName() | !validatePassword())
        {
            return;
        }
        String input="Name" +textInputName.getEditText().getText().toString();
        input+="\n";
        input+="Password"+textInputPassword.getEditText().getText().toString();

        Toast.makeText(this,input,Toast.LENGTH_SHORT).show();

    }
    public void openDialog()
    {
        ExampleDialog exampleDialog=new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(),"example dialog");
    }

    @Override
    public void applyTexts(String colonyname, String housename, String doornumber) {
     textViewAddress.setText(colonyname);
        textViewAddress.setText(housename);
        textViewAddress.setText(doornumber);
    }
}
