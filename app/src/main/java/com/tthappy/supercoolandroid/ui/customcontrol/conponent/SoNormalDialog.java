package com.tthappy.supercoolandroid.ui.customcontrol.conponent;

import android.app.Dialog;
import android.content.Context;

import androidx.annotation.NonNull;

import com.tthappy.supercoolandroid.R;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/23 9:13
 * Update Date:
 * Modified By:
 * Description:
 */
public class SoNormalDialog extends Dialog {
    public SoNormalDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.dialog_so_normal);
        getWindow().setWindowAnimations(R.style.NoAnimationDialog);
        show();
    }
}
