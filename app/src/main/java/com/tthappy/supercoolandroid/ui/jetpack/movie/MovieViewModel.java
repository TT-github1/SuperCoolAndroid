package com.tthappy.supercoolandroid.ui.jetpack.movie;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tthappy.supercoolandroid.Internet.repository.RetrofitUtils;
import com.tthappy.supercoolandroid.entities.MovieEntity;
import com.tthappy.supercoolandroid.entities.UITestEntity;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.blankj.utilcode.util.LogUtils.e;
import static com.tthappy.supercoolandroid.utils.sp.GlobalHooker.TESTI;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/16 16:46
 * Update Date:
 * Modified By:
 * Description:
 */
public class MovieViewModel extends ViewModel {

    GetDataSuccessListener listener;

    MutableLiveData<MovieEntity> liveData = new MutableLiveData<>(new MovieEntity());

    public void getMovieData(String id){
        Disposable disposable = RetrofitUtils.getInstance(this).getApiService().getData("?id=" + id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(new Action() {
                    @Override
                    public void run() throws Exception {
                        listener.getDataSuccess();
                    }
                })
                .subscribe(new Consumer<MovieEntity>() {
                    @Override
                    public void accept(MovieEntity uiTestEntity) throws Exception {
                        liveData.setValue(uiTestEntity);
                    }
                }, new Consumer() {
                    @Override
                    public void accept(Object o) throws Exception {
                        e(o);
                    }
                });
    }

    public MutableLiveData<MovieEntity> getLiveData() {
        return liveData;
    }

    public void setListener(GetDataSuccessListener listener){
        this.listener = listener;
    }

    interface GetDataSuccessListener{
        void getDataSuccess();
    }
}
