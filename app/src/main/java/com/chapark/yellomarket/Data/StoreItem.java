package com.chapark.yellomarket.Data;

import android.graphics.drawable.Drawable;

/**
 * Created by Park on 2016-08-21.
 */
public class StoreItem {
    private Drawable photo;

    public StoreItem() {
    }

    public StoreItem(Drawable photo) {
        this.photo = photo;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }

}
