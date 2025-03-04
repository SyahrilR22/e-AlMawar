package com.example.e_almawar;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SiswaHomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa_home);

        // Inisialisasi BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Tampilkan fragment default (HomeFragment)
        if (savedInstanceState == null) {
            replaceFragment(new SiswaHomeFragment());
        }

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;

            if (item.getItemId() == R.id.home) {
                selectedFragment = new SiswaHomeFragment();
            } else if (item.getItemId() == R.id.school) {
                selectedFragment = new SiswaSchoolFragment();
            } else if (item.getItemId() == R.id.formulir) {
                selectedFragment = new SiswaFormulirFragment();
            } else if (item.getItemId() == R.id.akun) {
                selectedFragment = new SiswaAkunFragment();
            }

            if (selectedFragment != null) {
                replaceFragment(selectedFragment);
            }

            return true;
        });
    }

    // Metode untuk mengganti fragment
    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment); // Pastikan ID ini sesuai dengan XML
        fragmentTransaction.commit();
    }
}