package com.we.scp.andframe.ui;

import android.os.Bundle;

import com.we.scp.andframe.AppComponent;
import com.we.scp.andframe.R;

public  class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void inject(AppComponent appComponent) {

    }


}
