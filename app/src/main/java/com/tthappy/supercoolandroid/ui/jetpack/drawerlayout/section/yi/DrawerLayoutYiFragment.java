package com.tthappy.supercoolandroid.ui.jetpack.drawerlayout.section.yi;

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
import com.tthappy.supercoolandroid.databinding.FragmentDrawerLayoutYiBinding;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/10 17:41
 * Update Date:
 * Modified By:
 * Description:
 */
public class DrawerLayoutYiFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        DrawerLayoutYiViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DrawerLayoutYiViewModel.class);
        FragmentDrawerLayoutYiBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_drawer_layout_yi, container, false);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        View view = binding.getRoot();
        return view;
    }
}
