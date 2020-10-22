package com.tthappy.supercoolandroid.ui.test.uitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.ui.customcontrol.conponent.NormalDialog;
import com.tthappy.supercoolandroid.utils.bridge.service.BridgeConstants;

@Route(path = BridgeConstants.UI_TEST)
public class UITestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i_test);

        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new NormalDialog(UITestActivity.this).show();
            }
        });
    }
}