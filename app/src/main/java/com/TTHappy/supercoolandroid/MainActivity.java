package com.TTHappy.supercoolandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toolbar;

import com.TTHappy.supercoolandroid.entities.TabEntity;
import com.TTHappy.supercoolandroid.utils.DisplayUtil;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {


    private String[] mTitles = {"首页", "次页", "山治", "我的"};
    //tab没有被选中时的图标
    private int[] mUnSelectedIcons = {
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background
    };
    private int[] mSelectedIcons = {
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground
    };
    //tab集合
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();


    private CommonTabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.common_tab_layout);

        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i],mSelectedIcons[i],mUnSelectedIcons[i]));
        }

        if(null == tabLayout){
            tabLayout.setTabData(mTabEntities);
        }





    }
}