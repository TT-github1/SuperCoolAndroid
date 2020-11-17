package com.tthappy.supercoolandroid.ui.jetpack.sample;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.databinding.ActivitySampleBinding;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/10 15:13
 * Update Date:
 * Modified By:
 * Description:
 */
@Route(path = BridgeConstants.SAMPLE)
public class SampleActivity extends AppCompatActivity {

    ActivitySampleBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SampleViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(SampleViewModel.class);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sample);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        binding.text.setOnClickListener(v -> {
            viewModel.setTextA("更有沸雪酌与风云某");
        });

    }
}
