package com.tthappy.supercoolandroid.ui.main.category.home;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.tthappy.supercoolandroid.R;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/30 14:12
 * Update Date:
 * Modified By:
 * Description:
 */
public class HomeFragmentAdapter extends BaseQuickAdapter<HomeEntity, BaseViewHolder> {
    public HomeFragmentAdapter(@Nullable List<HomeEntity> data) {
        super(R.layout.item_home, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder helper, HomeEntity item) {
        helper.setImageResource(R.id.iv_head, item.getIcon());
        helper.setText(R.id.tv_name, item.getName());
        helper.setText(R.id.tv_desc, item.getDesc());
    }
}
