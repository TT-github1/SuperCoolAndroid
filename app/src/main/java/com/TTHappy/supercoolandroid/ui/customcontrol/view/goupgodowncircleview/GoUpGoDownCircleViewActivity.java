package com.TTHappy.supercoolandroid.ui.customcontrol.view.goupgodowncircleview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.TTHappy.supercoolandroid.R;
import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/12 15:07
 * Update Date:
 * Modified By:
 * Description:
 */
@Route(path = "/test/test1")
public class GoUpGoDownCircleViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goup_godown);
    }
}
