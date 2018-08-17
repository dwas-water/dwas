package com;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vaishnavi.dwas.Login;
import com.vaishnavi.dwas.R;

public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        Intent intent = null;
        assert intent != null;
        int number = intent.getIntExtra(Login.EXTRA_NUMBER, 0);
        String text2 = intent.getStringExtra(Login.EXTRA_TEXT);

        TextInputLayout textInputLayout1 = (TextInputLayout) view.findViewById(R.id.text_input_mobile);
        TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(R.id.text_input_password);

        textInputLayout1.setHintTextAppearance(Integer.parseInt("" + number));
        textInputLayout2.setHintTextAppearance(Integer.parseInt(text2));

        return view;
    }
}
