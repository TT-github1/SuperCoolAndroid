package com.tthappy.supercoolandroid.ui.main.category.home;

import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.utils.bridge.service.BridgeConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/30 14:25
 * Update Date:
 * Modified By:
 * Description:
 */
public class HomeData {
    private List<HomeEntity> data = new ArrayList<>();

    public List<HomeEntity> getData() {
        return data;
    }

    public HomeData() {
        data.add(new HomeEntity("超级无敌炫酷的自定义控件", R.drawable.icon_home_header, "这是得有多炫酷。。。", BridgeConstants.SHOW_CUSTOM_CONTROL));
        data.add(new HomeEntity("UI测试专用入口", R.drawable.icon_home_header, "闲杂人等禁止入内！！！", BridgeConstants.UI_TEST));
        data.add(new HomeEntity("阿巴阿巴阿巴", R.drawable.icon_home_header, "。。。", BridgeConstants.CC_GUGD));
        data.add(new HomeEntity("first", R.drawable.icon_home_header, "first", BridgeConstants.CC_PANEL));
        data.add(new HomeEntity("超级无敌炫酷的自定义控件", R.drawable.icon_home_header, "这是得有多炫酷。。。", BridgeConstants.JETPACK_SCORE));
        data.add(new HomeEntity("咩野都哞", R.drawable.icon_home_header, "emmm...", BridgeConstants.SHOW_CUSTOM_CONTROL));
        data.add(new HomeEntity("阿巴阿巴阿巴", R.drawable.icon_home_header, "。。。", BridgeConstants.SHOW_CUSTOM_CONTROL));
        data.add(new HomeEntity("first", R.drawable.icon_home_header, "first", BridgeConstants.SHOW_CUSTOM_CONTROL));
        data.add(new HomeEntity("超级无敌炫酷的自定义控件", R.drawable.icon_home_header, "这是得有多炫酷。。。", BridgeConstants.SHOW_CUSTOM_CONTROL));
        data.add(new HomeEntity("咩野都哞", R.drawable.icon_home_header, "emmm...", BridgeConstants.SHOW_CUSTOM_CONTROL));
        data.add(new HomeEntity("阿巴阿巴阿巴", R.drawable.icon_home_header, "。。。", BridgeConstants.SHOW_CUSTOM_CONTROL));
        data.add(new HomeEntity("first", R.drawable.icon_home_header, "first", BridgeConstants.SHOW_CUSTOM_CONTROL));
    }
}
