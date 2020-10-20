package com.tthappy.supercoolandroid.entities;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/12 13:57
 * Update Date:
 * Modified By:
 * Description:
 */
public class CustomControlEntity {
    private int mIcon;
    private String mName;
    private String mUrl;

    public int getmIcon() {
        return mIcon;
    }

    public void setmIcon(int mIcon) {
        this.mIcon = mIcon;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public CustomControlEntity(int mIcon, String mName, String mUrl) {
        this.mIcon = mIcon;
        this.mName = mName;
        this.mUrl = mUrl;
    }
}
