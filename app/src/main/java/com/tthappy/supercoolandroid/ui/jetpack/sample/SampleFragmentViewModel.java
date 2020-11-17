package com.tthappy.supercoolandroid.ui.jetpack.sample;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/10 15:52
 * Update Date:
 * Modified By:
 * Description:
 */
public class SampleFragmentViewModel extends ViewModel {
    MutableLiveData<String> textA;

    public MutableLiveData<String> getTextA() {
        if(null == textA) {
            textA = new MutableLiveData<>();
            textA.setValue("我自关山点酒千秋皆入喉");
        }
        return textA;
    }

    public void setTextA(String textA) {
        this.textA.setValue("更有沸雪酌与风云某");
    }
}
