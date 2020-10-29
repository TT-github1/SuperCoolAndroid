package com.tthappy.supercoolandroid.ui.customcontrol.conponent;

import android.content.Context;
import android.view.Gravity;
import android.view.Window;

import androidx.appcompat.app.AppCompatDialog;

import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.utils.app.DisplayUtils;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/29 15:21
 * Update Date:
 * Modified By:
 * Description:
 */
public class BigDialog extends AppCompatDialog {

    private Window mWindow;
    private Context mContext;

    public BigDialog(Context context) {
        super(context);
        mContext = context;
        initDialog();
    }

    private void initDialog(){
        setContentView(R.layout.dialog_normal);
        mWindow = getWindow();
        mWindow.setDimAmount(.5f);
        mWindow.setBackgroundDrawableResource(R.color.testColor1);
        mWindow.setGravity(Gravity.CENTER);
//        mWindow.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        DisplayUtils.hideDialogStatusBar(getWindow());
    }
}
