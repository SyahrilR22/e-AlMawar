package com.example.e_almawar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BiodataFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_biodata, container, false);

        Button nextButton = view.findViewById(R.id.btn_next);
        nextButton.setOnClickListener(v -> {
            ((SiswaFormulirFragment) getParentFragment()).nextPage();
        });

        return view;
    }
}
