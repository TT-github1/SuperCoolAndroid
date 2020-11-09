package com.tthappy.supercoolandroid.ui.question.scrollviewandviewpager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;
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

/**
 *   滑动冲突解决思路
 *   https://www.jianshu.com/p/8c635cb59fdf?utm_campaign=maleskine
 */