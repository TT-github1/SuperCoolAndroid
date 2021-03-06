package com.tthappy.supercoolandroid.ui.jetpack.score;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.databinding.ActivityScoreBinding;
import com.tthappy.supercoolandroid.ui.customcontrol.conponent.NormalDialog;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;

@Route(path = BridgeConstants.JETPACK_SCORE)
public class ScoreActivity extends AppCompatActivity {

    ActivityScoreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_score);
        ScoreViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(ScoreViewModel.class);
        binding.setData(viewModel);
        binding.setLifecycleOwner(this);

        init();
    }

    private void init(){

    }


}