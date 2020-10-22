package com.tthappy.supercoolandroid.ui.customcontrol.conponent;

import android.content.Context;
import android.view.View;

import androidx.appcompat.app.AppCompatDialog;

import com.tthappy.supercoolandroid.R;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/22 17:28
 * Update Date:
 * Modified By:
 * Description:
 */
public class NormalDialog extends AppCompatDialog {

    private Context context;

    public NormalDialog(Context context) {
        super(context);
        this.context = context;
        initView();
    }

    private void initView(){
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.dialog_normal);
        findViewById(R.id.tv_collect_all).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new NoBlingBlingDialog(context).show();
            }
        });
    }
}
