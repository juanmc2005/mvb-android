package com.juanmc.mvb.usecases;

import com.devsar.android.ucbindings.providers.SubjectProvider;

import rx.Observable;
import rx.subjects.Subject;

/**
 * Created by juanma on 18/11/16.
 */

public interface UseCase<T> {
    void run(Observable<T> service);
    SubjectProvider<? extends Subject<T,T>> provider();
    void cancel();
}
