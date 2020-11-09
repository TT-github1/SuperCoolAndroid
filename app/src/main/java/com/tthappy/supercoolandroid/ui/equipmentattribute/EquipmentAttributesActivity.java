package com.tthappy.supercoolandroid.ui.equipmentattribute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;
import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = BridgeConstants.EQUIPMENTATTRIBUTE)
public class EquipmentAttributesActivity extends AppCompatActivity {

    private Display display;
    private TextView tvShow;
    private DisplayMetrics outMetrics;
    private int widthPixels2;
    private DisplayMetrics metrics;
    private TextView tvMeasure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment_attributes);

        metrics = getResources().getDisplayMetrics();

        tvShow = findViewById(R.id.tv_show);
        tvMeasure = findViewById(R.id.tv_measure);

        findViewById(R.id.tv_text1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int widthPixels = metrics.widthPixels;
                int heightPixels = metrics.heightPixels;
                int widthDP = pxToDp(widthPixels);
                int heightDP = pxToDp(heightPixels);
                tvShow.setText("屏幕宽度（像素）：" + widthPixels + "    屏幕高度（像素）：" + heightPixels
                    + "\n屏幕宽度（DP）：" + widthDP + "    屏幕高度（DP）：" + heightDP);
//                被弃用
//                DisplayMetrics metrics = new DisplayMetrics();
//                getFragmentActivity(getActivity()).getWindowManager().getDefaultDisplay().getMetrics(metrics);
//                int width = metrics.widthPixels;
            }
        });
        findViewById(R.id.tv_text2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvShow.setText("控件宽度（像素）：" + tvMeasure.getWidth() + "    控件高度（像素）：" + tvMeasure.getHeight());
            }
        });
    }

    public int dpToPx(int dp){
         float scale = metrics.density;
         return (int)(dp * scale + 0.5f);
    }

    public int pxToDp(int px){
        float scale = metrics.density;
        return (int)(px / scale + 0.5f);
    }

}