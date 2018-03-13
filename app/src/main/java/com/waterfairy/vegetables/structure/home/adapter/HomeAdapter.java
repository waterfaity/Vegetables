package com.waterfairy.vegetables.structure.home.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * user : water_fairy
 * email:995637517@qq.com
 * date :2018/3/13
 * des  :
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private List<Object> objects;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (position == 0) new HomeAdapterHeadHandler().handle(objects.get(position));
        else {

        }
    }

    @Override
    public int getItemCount() {
        if (objects != null) return objects.size() + 1;
        return 1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

}
