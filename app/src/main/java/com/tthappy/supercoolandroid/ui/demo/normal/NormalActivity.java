package com.tthappy.supercoolandroid.ui.demo.normal;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tthappy.supercoolandroid.R;
import com.tthappy.supercoolandroid.utils.bridge.BridgeConstants;

/**
 * Author:      tfhe
 * Create Date: Created in 2020/11/10 14:43
 * Update Date:
 * Modified By:
 * Description:
 */
@Route(path = BridgeConstants.NORMAL)
public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        TextView textView = findViewById(R.id.text);
        textView.setOnClickListener(v -> {
            textView.setText("更有沸雪酌与风云某");
        });

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new NormalFragment()).commit();
    }
}
