package com.tthappy.supercoolandroid.ui.demo.normal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/10 14:46
 * Update Date:
 * Modified By:
 * Description:
 */
public class NormalFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_normal, container, false);
        TextView textView = view.findViewById(R.id.text);
        textView.setOnClickListener(v ->{
            textView.setText("更有沸雪酌与风云某");
        });
        return view;
    }
}
