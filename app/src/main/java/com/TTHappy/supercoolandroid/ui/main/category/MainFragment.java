package com.TTHappy.supercoolandroid.ui.main.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.TTHappy.supercoolandroid.R;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/10 18:21
 * Update Date:
 * Modified By:
 * Description:
 */
public class MainFragment extends Fragment {

    private ImageView mSearchBar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        mSearchBar = view.findViewById(R.id.iv_search_bar);
        mSearchBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build("/test/testone").navigation();
            }
        });

        return view;
    }

    public static MainFragment getInstance(){
        return new MainFragment();
    }

}
