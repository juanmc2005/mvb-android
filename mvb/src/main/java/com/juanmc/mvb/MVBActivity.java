package com.juanmc.mvb;

import com.devsar.android.ucbindings.bindings.BoundActivity;

/**
 * Created by juanma on 18/11/16.
 */

public abstract class MVBActivity extends BoundActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getViewModel().detachView();
    }

    protected abstract ViewModel<?> getViewModel();
}
