package com.tthappy.supercoolandroid.utils.bridge;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/13 10:35
 * Update Date:
 * Modified By:
 * Description:
 */
public class BridgeConstants {

    //自定义控件
    private static final String CUSTOM_CONTROL_PREFIX = "/customcontrol/";
    public static final String SHOW_CUSTOM_CONTROL = CUSTOM_CONTROL_PREFIX + "showCustomControl";
    public static final String CC_GUGD = CUSTOM_CONTROL_PREFIX + "goUpGoDown";
    public static final String CC_CHART = CUSTOM_CONTROL_PREFIX + "chart";
    public static final String CC_PANEL = CUSTOM_CONTROL_PREFIX + "panel";

    //经典问题
    private static final String QUESTION_PREFIX = "/question/";
    public static final String SCROLLVIEW_AND_VIEWPAGER = QUESTION_PREFIX + "scrollViewAndViewPager";
    public static final String EQUIPMENTATTRIBUTE = QUESTION_PREFIX + "equipmentAttribute";

    //jetpack
    private static final String JETPACK_PREFIX = "/jetpack/";
    public static final String JETPACK_SCORE = JETPACK_PREFIX + "score";
    public static final String DRAWER_LAYOUT = JETPACK_PREFIX + "drawerLayout";
    public static final String SAMPLE = JETPACK_PREFIX + "sample";

    //测试
    private static final String TEST = "/test/";
    public static final String UI_TEST = TEST + "ui";

    //demo
    private static final String DEMO = "/demo/";
    public static final String NORMAL = DEMO + "normal";
    public static final String OLD = DEMO + "old";

}
