package com.tthappy.supercoolandroid.ui.test.uitest;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.blankj.utilcode.util.LogUtils;
import com.tthappy.supercoolandroid.Internet.repository.RetrofitUtils;
import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.entities.UITestEntity;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


@Route(path = BridgeConstants.UI_TEST)
public class UITestActivity extends AppCompatActivity {

    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_test);


        findViewById(R.id.textView).setOnClickListener(v -> {

//            Retrofit retrofit = new Retrofit.Builder()
//                    .baseUrl("https://movie.querydata.org/api/")
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                    .build();
//
//            ApiService api = retrofit.create(ApiService.class);
//            Disposable disposable = api.getData()
//                    .subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .subscribe(new Consumer<UITestEntity>() {
//                        @Override
//                        public void accept(UITestEntity uiTestEntity) throws Exception {
//                            e(uiTestEntity.getId());
//                        }
//                    });


//            RetrofitUtils.getInstance(UITestActivity.this).getApiService().getData("?id=1302425")
//                    .subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .map(UITestEntity::getId)
//                    .map(s -> s + "2333")
//                    .subscribe(LogUtils::e);


        });


    }

}