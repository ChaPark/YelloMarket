package com.chapark.yellomarket;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.chapark.yellomarket.Data.StoreItem;

/**
 * Created by Park on 2016-08-21.
 */
public class StoreViewHolder extends RecyclerView.ViewHolder {


    ImageView photoView;

    public StoreViewHolder(View view) {
        super(view);
        photoView = (ImageView)view.findViewById(R.id.image_store);
    }

    StoreItem storeItem;
    public void setStoreItem(StoreItem storeItem){
        photoView.setImageDrawable(storeItem.getPhoto());
    }
}
