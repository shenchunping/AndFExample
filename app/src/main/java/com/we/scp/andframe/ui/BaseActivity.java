package com.we.scp.andframe.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.we.scp.andframe.App;
import com.we.scp.andframe.AppComponent;

/**
 * Created by T on 2017/12/8.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App app = (App) getApplication();
        inject(app.getAppComponent());
    }

    /**
     * 注入实体
     *
     * @param appComponent
     */
    protected abstract void inject(AppComponent appComponent);
}
