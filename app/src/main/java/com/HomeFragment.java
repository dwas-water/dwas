package com;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.muddzdev.styleabletoastlibrary.StyleableToast;
import com.vaishnavi.dwas.Order;
import com.vaishnavi.dwas.R;


public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button btn11 = (Button) view.findViewById(R.id.button10);

        btn11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v1) {
                Intent intent4 = new Intent(getActivity(), Order.class);
                startActivity(intent4);
            }
        });
        return view;
    }

    public void showToast(View v) {
        StyleableToast.makeText(getActivity(), "Unavailable at the moment", R.style.exampleToast).show();
    }
}


