package com.example.e_almawar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class SiswaHomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate layout fragment_home.xml
        View view = inflater.inflate(R.layout.fragment_siswa_home, container, false);

        // Inisialisasi tombol daftar
        Button daftarButton = view.findViewById(R.id.button_daftar);
        daftarButton.setOnClickListener(v -> {
            SiswaHomeActivity siswaHomeActivityy = (SiswaHomeActivity) getActivity();
            if (siswaHomeActivityy != null) {
                // Pindah ke FormulirFragment
                siswaHomeActivityy.replaceFragment(new SiswaFormulirFragment());

                // Set icon Formulir menjadi aktif di Bottom Navigation
                BottomNavigationView bottomNavigationView = siswaHomeActivityy.findViewById(R.id.bottom_navigation);
                bottomNavigationView.setSelectedItemId(R.id.formulir);
            }
        });

        return view;
    }
}