package com.tthappy.supercoolandroid.ui.jetpack.drawerlayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.databinding.FragmentDrawerLayoutBinding;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/9 19:00
 * Update Date:
 * Modified By:
 * Description:
 */
public class DrawerLayoutDrawerFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentDrawerLayoutBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_drawer_layout, container, false);
        DrawerLayoutFragmentViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DrawerLayoutFragmentViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        View view = binding.getRoot();
        return view;
    }
}
