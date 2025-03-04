package com.example.e_almawar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FormPagerAdapter extends FragmentStateAdapter {
    public FormPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new BiodataFragment();
            case 1: return new OrangtuaFragment();
            case 2: return new WaliFragment();
            case 3: return new TempatTinggalFragment();
            default: return new BiodataFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
