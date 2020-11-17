package com.tthappy.supercoolandroid.ui.customcontrol.view.chart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;
import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = BridgeConstants.CC_CHART)
public class ChartViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_view);
    }
}