package com.tthappy.supercoolandroid.ui.jetpack.drawerlayout;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.tabs.TabLayout;
import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.databinding.ActivityDrawerLayoutBinding;
import com.tthappy.supercoolandroid.utils.app.DisplayUtils;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/9 17:06
 * Update Date:
 * Modified By:
 * Description:
 */
@Route(path = BridgeConstants.DRAWER_LAYOUT)
public class DrawerLayoutActivity extends AppCompatActivity {

    private int currentFragment = 0;
    private NavController navController;

    ActivityDrawerLayoutBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_drawer_layout);
        DrawerLayoutViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DrawerLayoutViewModel.class);
        binding.setData(viewModel);
        binding.setLifecycleOwner(this);

        DisplayUtils.hideStatusBar(this);

        init();
    }

    private void init() {
        binding.myOpenDrawer.setScrimColor(Color.TRANSPARENT);

        String[] titles = {"首页", "次页", "三页", "四页"};
        for (int i = 0; i < titles.length; i++) {
            binding.tablayout.addTab(binding.tablayout.newTab().setText(titles[i]));
        }
        navController = Navigation.findNavController(DrawerLayoutActivity.this, R.id.my_nav_host_fragment);
        binding.tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        navController.navigate(R.id.fragment_home);
                        break;
                    case 1:
                        navController.navigate(R.id.fragment_second);
                        break;
                    case 2:
                        navController.navigate(R.id.fragment_third);
                        break;
                    case 3:
                        navController.navigate(R.id.fourthFragment);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

//    @Override
//    public boolean onSupportNavigateUp() {
//        binding.tablayout.getTabAt()
//        return Navigation.findNavController(DrawerLayoutActivity.this, R.id.my_nav_host_fragment).navigateUp();
//    }
}
