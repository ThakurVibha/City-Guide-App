package com.vibhathakur.cityguide.HelperClasses.HomeAdapter;

import android.graphics.drawable.GradientDrawable;

public class CategoriesHelperClass {
    GradientDrawable image;

    public CategoriesHelperClass(GradientDrawable image, int title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public GradientDrawable getImage() {
        return image;
    }

    public int getTitile() {
        return title;
    }

    public String getGradient() {
        return description;
    }

    int title;
    String description;

}

