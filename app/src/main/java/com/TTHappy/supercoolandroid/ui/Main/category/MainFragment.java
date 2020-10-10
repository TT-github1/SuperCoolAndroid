package com.TTHappy.supercoolandroid.ui.Main.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.TTHappy.supercoolandroid.R;

import java.util.zip.Inflater;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/10 18:21
 * Update Date:
 * Modified By:
 * Description:
 */
public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public static MainFragment getInstance(){
        return new MainFragment();
    }

}
