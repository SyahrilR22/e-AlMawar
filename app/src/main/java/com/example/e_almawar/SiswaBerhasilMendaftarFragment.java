package com.example.e_almawar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class SiswaBerhasilMendaftarFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_siswa_berhasil_mendaftar, container, false);

        Button btnOk = view.findViewById(R.id.btn_ok);
        btnOk.setOnClickListener(v -> {
            // Navigasi ke SiswaHomeFragment
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, new SiswaHomeFragment());
            fragmentTransaction.commit();

            // Perbarui bottom navigation agar menu home aktif
            BottomNavigationView bottomNavigationView = requireActivity().findViewById(R.id.bottom_navigation);
            if (bottomNavigationView != null) {
                bottomNavigationView.setSelectedItemId(R.id.home); // Ganti dengan ID yang benar
            }
        });

        return view;
    }
}
