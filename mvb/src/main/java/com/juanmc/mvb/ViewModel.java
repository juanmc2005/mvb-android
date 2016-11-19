package com.juanmc.mvb;

import com.juanmc.mvb.usecases.UseCase;

/**
 * Created by juanma on 18/11/16.
 */

public abstract class ViewModel<V extends MVBView> {

    private V view;

    public ViewModel(V view) {
        this.view = view;
    }

    protected V getView() {
        return view;
    }

    public void detachView() {
        view = null;
        for (UseCase uc : getUseCases()) uc.cancel();
    }

    protected abstract UseCase[] getUseCases();
}
