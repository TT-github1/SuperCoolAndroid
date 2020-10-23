package com.tthappy.supercoolandroid.ui.test.uitest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.ui.customcontrol.conponent.NormalDialog;
import com.tthappy.supercoolandroid.utils.bridge.service.BridgeConstants;

@Route(path = BridgeConstants.UI_TEST)
public class UITestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_test);

        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NormalDialog dialog = new NormalDialog(UITestActivity.this);
                dialog.getWindow().setDimAmount(.8f);
                WindowManager.LayoutParams params = dialog.getWindow().getAttributes();
                params.x = 10;
                params.y = 100;
                params.width = 220;
                params.height = 200;
                dialog.getWindow().setAttributes(params);
                dialog.show();
                dialog.getWindow().setGravity(Gravity.TOP);
            }
        });
    }
}