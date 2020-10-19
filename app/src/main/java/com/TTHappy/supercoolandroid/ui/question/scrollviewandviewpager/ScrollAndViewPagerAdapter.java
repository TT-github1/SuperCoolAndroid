package com.TTHappy.supercoolandroid.ui.question.scrollviewandviewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.TTHappy.supercoolandroid.R;

import java.util.ArrayList;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/19 17:22
 * Update Date:
 * Modified By:
 * Description:
 */
public class ScrollAndViewPagerAdapter extends PagerAdapter {

    private Context mContext;
    private ArrayList<View> pageList = new ArrayList<>();

    public ScrollAndViewPagerAdapter(Context context){
        mContext = context;
        pageList.add(LayoutInflater.from(context).inflate(R.layout.page_question_scroll, null));
        pageList.add(LayoutInflater.from(context).inflate(R.layout.page_question_pager, null));
    }

    @Override
    public int getCount() {
        return pageList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(pageList.get(position));
        return pageList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // TODO Auto-generated method stub
        // 将当前位置的View移除
        container.removeView(pageList.get(position));
    }
}
