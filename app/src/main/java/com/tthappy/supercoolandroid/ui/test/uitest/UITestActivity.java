package com.tthappy.supercoolandroid.ui.test.uitest;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.ui.customcontrol.conponent.BigDialog;
import com.tthappy.supercoolandroid.ui.customcontrol.conponent.NormalDialog;
import com.tthappy.supercoolandroid.utils.app.DisplayUtils;
import com.tthappy.supercoolandroid.utils.bridge.service.BridgeConstants;
import com.tthappy.supercoolandroid.utils.statuebar.StatusBarUtil;

@Route(path = BridgeConstants.UI_TEST)
public class UITestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_test);


        findViewById(R.id.textView).setOnClickListener(v -> {
            new BigDialog(UITestActivity.this).show();
        });


    }
}