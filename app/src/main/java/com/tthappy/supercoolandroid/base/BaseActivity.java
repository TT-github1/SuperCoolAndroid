package com.tthappy.supercoolandroid.base;

import android.os.Bundle;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/30 13:47
 * Update Date:
 * Modified By:
 * Description:
 */
public abstract class BaseActivity extends AppCompatActivity {
    private Unbinder unBinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);

        setContentView(getLayoutId());
        initView();
        initData();
        initListener();
        unBinder = ButterKnife.bind(this);
    }

    protected abstract @LayoutRes int getLayoutId();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract void initListener();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unBinder != null) {
            unBinder.unbind();
        }
    }
}
