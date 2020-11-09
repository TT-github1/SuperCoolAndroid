package com.tthappy.supercoolandroid.utils.bridge;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.DegradeService;
import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.LogUtils;

import java.util.Map;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/5 17:45
 * Update Date:
 * Modified By:
 * Description:
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
