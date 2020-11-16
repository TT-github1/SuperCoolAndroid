package com.tthappy.supercoolandroid.ui.demo.old;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.entities.TabEntity;
import com.tthappy.supercoolandroid.ui.main.category.FourthFragment;
import com.tthappy.supercoolandroid.ui.main.category.SecondFragment;
import com.tthappy.supercoolandroid.ui.main.category.ThirdFragment;
import com.tthappy.supercoolandroid.ui.main.category.home.HomeFragment;
import com.tthappy.supercoolandroid.utils.app.DisplayUtils;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;

import java.util.ArrayList;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/10 16:27
 * Update Date:
 * Modified By:
 * Description:
 */
@Route(path = BridgeConstants.OLD)
public class OldActivity extends AppCompatActivity {

    private HomeFragment fragment1;
    private SecondFragment fragment2;
    private ThirdFragment fragment3;
    private FourthFragment fragment4;


    private String[] mTitles = {"首页", "次页", "山治", "我的"};
    //tab没有被选中时的图标
    private int[] mUnSelectedIcons = {
            R.drawable.bg_tab_main_unselected,
            R.drawable.bg_tab_second_unselected,
            R.drawable.bg_tab_third_unselected,
            R.drawable.bg_tab_fourth_unselected
    };
    private int[] mSelectedIcons = {
            R.drawable.bg_tab_main_selected,
            R.drawable.bg_tab_second_selected,
            R.drawable.bg_tab_third_selected,
            R.drawable.bg_tab_fourth_selected
    };
    //tab集合
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();

    private CommonTabLayout tabLayout;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayUtils.setTransparentStatusBar(this);
        DisplayUtils.setStatusBarFontDarkMode(getWindow(), true);

        tabLayout = findViewById(R.id.common_tab_layout);


        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i],mSelectedIcons[i],mUnSelectedIcons[i]));
        }

        tabLayout.setTabData(mTabEntities);
        tabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                switchFragment(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });

        switchFragment(0);
    }

    private void switchFragment(int position) {
        transaction = getSupportFragmentManager().beginTransaction();
        hideFragments();
        switch (position){
            case 1: if(null == fragment2){
                fragment2 = SecondFragment.getInstance();
                transaction.add(R.id.fl_container,fragment2,"second");
            }else {
                transaction.show(fragment2);
            }
                break;
            case 2: if(null == fragment3){
                fragment3 = ThirdFragment.getInstance();
                transaction.add(R.id.fl_container,fragment3,"third");
            }else {
                transaction.show(fragment3);
            }
                break;
            case 3: if(null == fragment4){
                fragment4 = FourthFragment.getInstance();
                transaction.add(R.id.fl_container,fragment4,"fourth");
            }else {
                transaction.show(fragment4);
            }
                break;
            default: if(null == fragment1){
                fragment1 = HomeFragment.getInstance();
                transaction.add(R.id.fl_container,fragment1,"main");
            }else {
                transaction.show(fragment1);
            }
                break;
        }
        transaction.commit();
    }

    private void hideFragments() {
        if(null != fragment1){
            transaction.hide(fragment1);
        }
        if(null != fragment2){
            transaction.hide(fragment2);
        }
        if(null != fragment3){
            transaction.hide(fragment3);
        }
        if(null != fragment4){
            transaction.hide(fragment4);
        }
    }
}