package com.tthappy.supercoolandroid.ui.jetpack.movie;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bumptech.glide.Glide;
import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.databinding.ActivityMovieBinding;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;

@Route(path = BridgeConstants.MOVIE)
public class MovieActivity extends AppCompatActivity{

    ActivityMovieBinding binding;
    private MovieViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie);
        viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(MovieViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        EditText editText = binding.input;
        binding.commit.setOnClickListener(v -> viewModel.getMovieData(editText.getText().toString()));

        viewModel.liveData.observe(this, entity -> {
            String showTextString =
                    "电影名称：" + entity.getData().get(0).getName() + "\n\n" +
                    "导演名称：" + entity.getDirector().get(0).getData().get(0).getName() + "\n\n" +
                    "主演名称：" + entity.getActor().get(0).getData().get(0).getName() + "\n\n" +
                    "电影简介：" + entity.getData().get(0).getDescription() + "\n\n";
            binding.name.setText(showTextString);
            Glide.with(MovieActivity.this).load(entity.getData().get(0).getPoster()).into(binding.picture);
        });
    }
}