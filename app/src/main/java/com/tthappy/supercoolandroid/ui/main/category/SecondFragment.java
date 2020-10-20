package com.tthappy.supercoolandroid.ui.main.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.tthappy.supercoolandroid.R;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/10 18:21
 * Update Date:
 * Modified By:
 * Description:
 */
public class SecondFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        return view;
    }

    public static SecondFragment getInstance(){
        return new SecondFragment();
    }

}
