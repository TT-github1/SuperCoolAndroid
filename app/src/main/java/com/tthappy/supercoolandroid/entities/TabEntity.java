package com.tthappy.supercoolandroid.entities;

import com.flyco.tablayout.listener.CustomTabEntity;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/10 17:17
 * Update Date:
 * Modified By:
 * Description:
 */
public class TabEntity implements CustomTabEntity {
    public String title;
    public int selectedIcon;
    public int unSelectedIcon;

    public TabEntity(String title, int selectedIcon, int unSelectedIcon) {
        this.title = title;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
    }

    @Override
    public String getTabTitle() {
        return title;
    }

    @Override
    public int getTabSelectedIcon() {
        return selectedIcon;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unSelectedIcon;
    }
}
