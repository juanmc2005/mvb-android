package com.juanmc.mvbsample;

import rx.Observable;

/**
 * Created by juanma on 18/11/16.
 */

public class SomeService {

    public Observable<String> someNetworkService(Integer x) {
        return Observable.just(String.valueOf(x));
    }
}
