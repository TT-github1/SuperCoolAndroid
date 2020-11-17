package com.tthappy.supercoolandroid.ui.jetpack.movie;

import androidx.lifecycle.ViewModel;

import com.blankj.utilcode.util.LogUtils;
import com.tthappy.supercoolandroid.Internet.repository.RetrofitUtils;
import com.tthappy.supercoolandroid.entities.MovieEntity;
import com.tthappy.supercoolandroid.ui.jetpack.base.event.SingleLiveData;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/16 16:46
 * Update Date:
 * Modified By:
 * Description:
 */
public class MovieViewModel extends ViewModel {
    SingleLiveData<MovieEntity> liveData = new SingleLiveData<>();

    public void getMovieData(String id){
        Disposable disposable = RetrofitUtils.getInstance(this).getApiService().getData("?id=" + id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(uiTestEntity -> liveData.postValue(uiTestEntity), LogUtils::e);
    }
}
