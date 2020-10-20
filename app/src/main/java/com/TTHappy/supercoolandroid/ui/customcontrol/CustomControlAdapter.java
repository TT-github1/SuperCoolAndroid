package com.TTHappy.supercoolandroid.ui.customcontrol;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.TTHappy.supercoolandroid.R;
import com.TTHappy.supercoolandroid.entities.CustomControlEntity;
import com.TTHappy.supercoolandroid.utils.bridge.service.BridgeConstants;
import com.alibaba.android.arouter.launcher.ARouter;

import java.util.ArrayList;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/12 13:32
 * Update Date:
 * Modified By:
 * Description:
 */
public class CustomControlAdapter extends RecyclerView.Adapter<CustomControlAdapter.ViewHolder> {

    private ArrayList<CustomControlEntity> list = new ArrayList<>();

    public CustomControlAdapter(){
        if (list.isEmpty()){
            list.add(new CustomControlEntity(R.drawable.bg_tab_fourth_selected, "gogo", BridgeConstants.CC_GUGD));
            list.add(new CustomControlEntity(R.drawable.bg_tab_fourth_unselected, "xxx", BridgeConstants.CC_PANEL));
            list.add(new CustomControlEntity(R.drawable.bg_tab_fourth_selected, "ggg", BridgeConstants.CC_CHART));
            list.add(new CustomControlEntity(R.drawable.bg_tab_fourth_selected, "gogo", BridgeConstants.SCROLLVIEW_AND_VIEWPAGER));
            list.add(new CustomControlEntity(R.drawable.bg_tab_fourth_unselected, "xxx", BridgeConstants.EQUIPMENTATTRIBUTE));
            list.add(new CustomControlEntity(R.drawable.bg_tab_fourth_selected, "ggg", BridgeConstants.CC_GUGD));
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_control,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final CustomControlEntity item = list.get(position);
        holder.mIcon.setImageResource(item.getmIcon());
        holder.mNameTextView.setText(item.getmName());
        holder.mItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(item.getmUrl()).navigation();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView mIcon;
        TextView mNameTextView;
        ConstraintLayout mItem;

        public ViewHolder(@NonNull View view) {
            super(view);
            mIcon = view.findViewById(R.id.iv_icon);
            mNameTextView = view.findViewById(R.id.tv_name);
            mItem = view.findViewById(R.id.cl_hole_item);
        }
    }
}
