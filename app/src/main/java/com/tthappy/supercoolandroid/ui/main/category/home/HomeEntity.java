package com.tthappy.supercoolandroid.ui.main.category.home;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/30 14:15
 * Update Date:
 * Modified By:
 * Description:
 */
public class HomeEntity {
    private String name;
    private int icon;
    private String desc;
    private boolean isNew;
    private String url;

    public HomeEntity(String name, int icon, String desc, String url) {
        this(name, icon, desc, url, false);
    }

    public HomeEntity(String name, int icon, String desc, String url, boolean isNew) {
        this.name = name;
        this.icon = icon;
        this.desc = desc;
        this.isNew = isNew;
        this.url = url;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
