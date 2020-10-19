package com.TTHappy.supercoolandroid.ui.question.scrollviewandviewpager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.TTHappy.supercoolandroid.R;
import com.TTHappy.supercoolandroid.utils.bridge.service.BridgeConstants;
import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = BridgeConstants.SCROLLVIEW_AND_VIEWPAGER)
public class ScrollViewAndViewPagerActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_and_view_pager);

        viewPager = findViewById(R.id.vp_container);
        viewPager.setAdapter(new ScrollAndViewPagerAdapter(this));

    }
}