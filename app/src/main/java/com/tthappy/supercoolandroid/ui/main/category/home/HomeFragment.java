package com.tthappy.supercoolandroid.ui.main.category.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.blankj.utilcode.util.LogUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.tthappy.supercoolandroid.R;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/10 18:21
 * Update Date:
 * Modified By:
 * Description:
 */
public class HomeFragment extends Fragment {

    private ImageView mSearchBar;
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        initView(view);
        initData();
        initListener();
        return view;
    }

    public static HomeFragment getInstance(){
        return new HomeFragment();
    }

    private void initView(View view){
//        mSearchBar = view.findViewById(R.id.iv_search_bar);
        mRecyclerView = view.findViewById(R.id.rv_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        HomeFragmentAdapter adapter = new HomeFragmentAdapter(new HomeData().getData());
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {
                String url = ((HomeEntity)(adapter.getData().get(position))).getUrl();
                ARouter.getInstance().build(url).navigation();
            }
        });
        mRecyclerView.setAdapter(adapter);
    }

    private void initData(){

    }

    private void initListener(){
//        mSearchBar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ARouter.getInstance().build("/test/testone").navigation();
//            }
//        });
    }

}
