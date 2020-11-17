package com.tthappy.supercoolandroid.utils.bridge;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.DegradeService;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/5 17:45
 * Update Date:
 * Modified By:
 * Description: 降级策略 跳转发生错误会执行这个类的onLost方法
 */

@Route(path = "/degrade/service")
public class DegradeServiceImpl implements DegradeService {

    public void onLost(Context context, Postcard postcard) {

        ARouter.getInstance().build(BridgeConstants.CC_GUGD).navigation();

    }

    @Override
    public void init(Context context) {

    }
}
