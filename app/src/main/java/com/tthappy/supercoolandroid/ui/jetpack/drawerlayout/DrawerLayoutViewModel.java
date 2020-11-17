package com.tthappy.supercoolandroid.ui.jetpack.drawerlayout;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/9 17:08
 * Update Date:
 * Modified By:
 * Description:
 */
public class DrawerLayoutViewModel extends ViewModel {
    private MutableLiveData<String> textString = new MutableLiveData<>();

    public MutableLiveData<String> getText(){
        if(null == textString) textString.setValue("supercool");
        return textString;
    }

    public void setText(String str){
        textString.setValue(str);
    }
}
