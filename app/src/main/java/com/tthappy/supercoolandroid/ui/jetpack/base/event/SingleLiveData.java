package com.tthappy.supercoolandroid.ui.jetpack.base.event;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import java.util.concurrent.atomic.AtomicBoolean;

import static com.blankj.utilcode.util.LogUtils.e;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/16 20:12
 * Update Date:
 * Modified By:
 * Description:
 */
public class SingleLiveData<T> extends MutableLiveData<T> {

    private T t;

    private final AtomicBoolean pending = new AtomicBoolean(false);

    @Override
    public void setValue(T value) {
        pending.set(true);
        super.setValue(value);
    }

    public void call(){
        setValue(null);
    }

    @Override
    public void observe(@NonNull LifecycleOwner owner, @NonNull Observer<? super T> observer) {
        if (hasActiveObservers()) {
            e("SuperCool", "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(owner, new Observer<T>() {
            @Override
            public void onChanged(T t) {
                if (pending.compareAndSet(true, false)) {
                    if(null != t) observer.onChanged(t);
                }
            }
        });
    }
}
