package com.TTHappy.supercoolandroid.ui.customcontrol.view.chart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.TTHappy.supercoolandroid.R;
import com.TTHappy.supercoolandroid.utils.bridge.service.BridgeConstants;
import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = BridgeConstants.CC_CHART)
public class ChartViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_view);
    }
}