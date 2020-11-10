package com.tthappy.supercoolandroid.ui.jetpack.sample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.databinding.FragmentSampleBinding;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/10 15:43
 * Update Date:
 * Modified By:
 * Description:
 */
public class SampleFragment extends Fragment {

    FragmentSampleBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sample, container, false);
        View view = binding.getRoot();
        SampleFragmentViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(SampleFragmentViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        TextView textView = view.findViewById(R.id.text);
        binding.text.setOnClickListener(v -> {
            viewModel.setTextA("更有沸雪酌与风云某");
        });
        return view;
    }
}
