package com.tthappy.supercoolandroid.ui.customcontrol.conponent;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatDialog;

import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.utils.app.AppUtils;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/22 17:54
 * Update Date:
 * Modified By:
 * Description:
 */
public class NoBlingBlingDialog extends AppCompatDialog {
    private Context context;

    public NoBlingBlingDialog(Context context) {
        super(context);
        initView();
    }

    private void initView(){
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.dialog_no_bling_bling);
    }

    @Override
    public void show() {
        // check the lifecycle of activity
        if (context instanceof Activity && AppUtils.isActivityDead((Activity) context)) {
            return;
        }

        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.NoAnimationDialog);
            WindowManager.LayoutParams wl = window.getAttributes();
            wl.gravity = Gravity.CENTER;
            window.setAttributes(wl);
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        super.show();
    }

}
