package com.tthappy.supercoolandroid.ui.test.uitest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.utils.app.DisplayUtils;
import com.tthappy.supercoolandroid.utils.bridge.service.BridgeConstants;

@Route(path = BridgeConstants.UI_TEST)
public class UITestActivity extends AppCompatActivity {

    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_test);


        findViewById(R.id.textView).setOnClickListener(v -> {
//            new BigDialog(UITestActivity.this).show();
            DisplayUtils.setTransparentStatusBar(UITestActivity.this);
            DisplayUtils.setStatusBarFontDarkMode(getWindow(), flag);
            flag = !flag;
        });


    }
}