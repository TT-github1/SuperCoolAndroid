package com.tthappy.supercoolandroid.ui.main.category;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.entities.CustomControlEntity;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;

import java.util.ArrayList;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/10 18:21
 * Update Date:
 * Modified By:
 * Description:
 */
public class SecondFragment extends Fragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        recyclerView = view.findViewById(R.id.rv_list);
        TextView textView = view.findViewById(R.id.text_btn);
        textView.setOnClickListener(v ->{
            textView.setText("更有沸雪酌与风云某");
        });
        Log.e("hhh","oncreateview");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("hhh","onviewcreated");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.e("hhh","onstart");
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        SecondAdapter adapter = new SecondAdapter(getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    public static SecondFragment getInstance(){
        Log.e("hhh","newinstance");
        return new SecondFragment();
    }







    static class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder>{

        private Context context;
        private ArrayList<CustomControlEntity> list = new ArrayList<>();

        SecondAdapter(Context context){
            this.context = context;
            if(null == list){
                list.add(new CustomControlEntity(R.drawable.bg_tab_fourth_selected, "gogo", BridgeConstants.CC_GUGD));
                list.add(new CustomControlEntity(R.drawable.bg_tab_fourth_selected, "gogo", BridgeConstants.CC_GUGD));
                list.add(new CustomControlEntity(R.drawable.bg_tab_fourth_selected, "gogo", BridgeConstants.CC_GUGD));
            }
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_second_fragment, null);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            CustomControlEntity item = list.get(position);
            holder.tvName.setText(item.getmName());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            TextView tvName;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                tvName = itemView.findViewById(R.id.tv_name);
            }
        }
    }

}
