package com.tthappy.supercoolandroid.ui.jetpack.drawerlayout.section.yi;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/10 17:45
 * Update Date:
 * Modified By:
 * Description:
 */
public class DrawerLayoutYiViewModel extends ViewModel {
    MutableLiveData<String> textA;

    public MutableLiveData<String> getTextA() {
        return textA;
    }

    public void setTextA(String textA) {
        this.textA.setValue(textA);
    }
}
