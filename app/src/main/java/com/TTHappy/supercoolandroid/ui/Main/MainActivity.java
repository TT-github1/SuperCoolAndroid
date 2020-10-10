package com.TTHappy.supercoolandroid.ui.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import android.widget.Toolbar;

import com.TTHappy.supercoolandroid.R;
import com.TTHappy.supercoolandroid.entities.TabEntity;
import com.TTHappy.supercoolandroid.ui.Main.category.MainFragment;
import com.TTHappy.supercoolandroid.utils.DisplayUtil;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    private MainFragment fragment;


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


        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        tabLayout.setTabData(mTabEntities);
        tabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                if(null == fragment){
                    fragment = MainFragment.getInstance();
                    Toast.makeText(MainActivity.this, "有没有搞错", Toast.LENGTH_SHORT).show();
                    transaction.add(R.id.fl_container,fragment,"main");
                }else {
                    Toast.makeText(MainActivity.this, "搞错", Toast.LENGTH_SHORT).show();
                    transaction.show(fragment);
                }
                transaction.commit();
            }

            @Override
            public void onTabReselect(int position) {

            }
        });




    }
}