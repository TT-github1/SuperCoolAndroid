package com.tthappy.supercoolandroid.ui.test.uitest;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.blankj.utilcode.util.LogUtils;
import com.tthappy.supercoolandroid.Internet.api.ApiService;
import com.tthappy.supercoolandroid.Internet.base.BaseResult;
import com.tthappy.supercoolandroid.R;

import com.tthappy.supercoolandroid.entities.UITestEntity;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;


import java.io.IOException;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.blankj.utilcode.util.LogUtils.e;
import static com.tthappy.supercoolandroid.utils.sp.GlobalHooker.TESTI;


@Route(path = BridgeConstants.UI_TEST)
public class UITestActivity extends AppCompatActivity {

    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_test);


        findViewById(R.id.textView).setOnClickListener(v -> {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://movie.querydata.org/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();

            ApiService api = retrofit.create(ApiService.class);
            Disposable disposable = api.getData()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Consumer<UITestEntity>() {
                        @Override
                        public void accept(UITestEntity uiTestEntity) throws Exception {
                            e(uiTestEntity.getId());
                        }
                    });

        });


    }
}