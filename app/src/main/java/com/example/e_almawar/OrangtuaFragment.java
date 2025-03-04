package com.example.e_almawar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class OrangtuaFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_orangtua, container, false);

        // Tombol Next
        Button nextButton = view.findViewById(R.id.btn_next);
        nextButton.setOnClickListener(v -> {
            ((SiswaFormulirFragment) getParentFragment()).nextPage();
        });

        // Tombol Previous
        Button prevButton = view.findViewById(R.id.btn_prev);
        prevButton.setOnClickListener(v -> {
            ((SiswaFormulirFragment) getParentFragment()).previousPage();
        });

        return view;
    }
}
