package com.tthappy.supercoolandroid.ui.jetpack.score;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tthappy.supercoolandroid.Internet.api.ApiService;
import com.tthappy.supercoolandroid.entities.UITestEntity;
import com.tthappy.supercoolandroid.ui.test.classtest.NormalTest;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.blankj.utilcode.util.LogUtils.e;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/10/20 18:58
 * Update Date:
 * Modified By:
 * Description:
 */
public class ScoreViewModel extends ViewModel {
    private MutableLiveData<UITestEntity> scoreTeamA;
    private MutableLiveData<Integer> scoreTeamB;

    public MutableLiveData<UITestEntity> getScoreTeamA() {
//        if(null == scoreTeamA){
//            scoreTeamA = new MutableLiveData<>();
//            //在这里做网络请求等
//
//            Retrofit retrofit = new Retrofit.Builder()
//                    .baseUrl("https://movie.querydata.org/api/")
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                    .build();
//
//            ApiService api = retrofit.create(ApiService.class);
//            Disposable disposable = api.getData("1302425")
//                    .subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .subscribe(new Consumer<UITestEntity>() {
//                        @Override
//                        public void accept(UITestEntity uiTestEntity) throws Exception {
//                            e(uiTestEntity.getId());
//                            scoreTeamA.setValue(uiTestEntity);
//                        }
//                    });
//        }
        return scoreTeamA;
    }

    public MutableLiveData<Integer> getScoreTeamB() {
        if(null == scoreTeamB){
            scoreTeamB = new MutableLiveData<>();
            scoreTeamB.setValue(0);
        }
        return scoreTeamB;
    }

//    public void addTeamA(int score){
//        scoreTeamA.setValue(scoreTeamA.getValue() + score);
//    }

    public void addTeamB(int score){
        scoreTeamB.setValue(scoreTeamB.getValue() + score);
    }

    public void reset(){
//        scoreTeamA.setValue(0);
        scoreTeamB.setValue(0);
    }

    public void initNormalTest(){
        NormalTest.first();
    }
}
