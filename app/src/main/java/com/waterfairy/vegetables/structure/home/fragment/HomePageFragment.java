package com.waterfairy.vegetables.structure.home.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.waterfairy.vegetables.R;

/**
 * @author water_fairy
 * @email 995637517@qq.com
 * @date 2018/2/18
 * @Description:
 */

public class HomePageFragment extends Fragment {
    private View mRootView;
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_page, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRootView = view;
        findView();
    }

    private void findView() {
        mRecyclerView = mRootView.findViewById(R.id.recycler_view);
    }
}
