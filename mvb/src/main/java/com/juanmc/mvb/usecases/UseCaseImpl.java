package com.juanmc.mvb.usecases;

import com.devsar.android.ucbindings.providers.SubjectProvider;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.subjects.Subject;

/**
 * Created by juanma on 18/11/16.
 */

class UseCaseImpl<T> implements UseCase<T> {

    private final SubjectProvider<? extends Subject<T,T>> provider;
    private Subscription subscription;

    public UseCaseImpl(SubjectProvider<? extends Subject<T, T>> provider) {
        this.provider = provider;
    }

    @Override
    public SubjectProvider<? extends Subject<T, T>> provider() {
        return provider;
    }

    @Override
    public void run(Observable<T> serviceSource) {
        subscription = serviceSource
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(provider.getSubject());
    }

    @Override
    public void cancel() {
        if (subscription != null) subscription.unsubscribe();
    }
}
