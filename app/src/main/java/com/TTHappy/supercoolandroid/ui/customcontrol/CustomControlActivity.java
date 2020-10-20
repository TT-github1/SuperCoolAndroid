package com.TTHappy.supercoolandroid.ui.customcontrol;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.TTHappy.supercoolandroid.R;
import com.alibaba.android.arouter.facade.annotation.Route;


/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/12 11:44
 * Update Date:
 * Modified By:
 * Description:
 */
@Route(path = "/test/testone")
public class CustomControlActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_control);

        recyclerView = findViewById(R.id.rv_list);

        GridLayoutManager layoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new CustomControlAdapter());
    }
}
