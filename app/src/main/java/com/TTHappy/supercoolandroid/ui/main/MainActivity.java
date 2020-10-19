package com.TTHappy.supercoolandroid.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.TTHappy.supercoolandroid.R;
import com.TTHappy.supercoolandroid.entities.TabEntity;
import com.TTHappy.supercoolandroid.ui.main.category.FourthFragment;
import com.TTHappy.supercoolandroid.ui.main.category.MainFragment;
import com.TTHappy.supercoolandroid.ui.main.category.SecondFragment;
import com.TTHappy.supercoolandroid.ui.main.category.ThirdFragment;
import com.TTHappy.supercoolandroid.utils.statuebar.StatusBarUtil;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private MainFragment fragment1;
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

        StatusBarUtil.setTranslucentStatus(this);

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
                        fragment1 = MainFragment.getInstance();
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

    public void changeAppLanguage(Locale locale) {
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        Configuration configuration = getResources().getConfiguration();
        configuration.setLocale(locale);
        getResources().updateConfiguration(configuration, metrics);
    }
}