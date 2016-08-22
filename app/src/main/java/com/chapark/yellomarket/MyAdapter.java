package com.chapark.yellomarket;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chapark.yellomarket.Data.StoreItem;

import java.util.List;

/**
 * Created by Park on 2016-08-21.
 */
public class MyAdapter extends RecyclerView.Adapter<StoreViewHolder>{



    List<StoreItem> items;

    public void setItems(List<StoreItem> list) {
        this.items = list;
    }


    public void add(StoreItem storeItem){
        items.add(storeItem);
        notifyDataSetChanged();
    }

    public void clear() {
        items.clear();
        notifyDataSetChanged();
    }


    @Override
    public StoreViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_store, parent, false);
        return new StoreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StoreViewHolder holder, int position) {
        holder.setStoreItem(items.get(position));
    }


    @Override
    public int getItemCount() {
        return items.size();
    }
}
