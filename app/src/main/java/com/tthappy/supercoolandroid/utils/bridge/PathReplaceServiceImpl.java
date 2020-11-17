package com.tthappy.supercoolandroid.utils.bridge;

import android.content.Context;
import android.net.Uri;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.PathReplaceService;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/9 8:55
 * Update Date:
 * Modified By:
 * Description:
 */
@Route(path = "/service/path") // 必须标明注解
public class PathReplaceServiceImpl implements PathReplaceService {
    @Override
    public String forString(String path) {
        String myPath = path;
        return myPath;
    }

    @Override
    public Uri forUri(Uri uri) {
        return uri;
    }

    @Override
    public void init(Context context) {

    }
}
