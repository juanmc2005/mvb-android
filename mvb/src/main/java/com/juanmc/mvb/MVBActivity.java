package com.juanmc.mvb;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by juanma on 18/11/16.
 */

public abstract class MVBActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getViewModel().detachView();
    }

    protected abstract ViewModel<?> getViewModel();
}
