package com.juanmc.mvb.usecases;

import com.devsar.android.ucbindings.providers.CacheAllProvider;
import com.devsar.android.ucbindings.providers.CacheLastProvider;
import com.devsar.android.ucbindings.providers.LastOnlyProvider;
import com.devsar.android.ucbindings.providers.NoCacheProvider;

/**
 * Created by juanma on 18/11/16.
 */

public class UseCaseFactory {

    public static <T> UseCase<T> lastOnly() {
        return new UseCaseImpl<>(new LastOnlyProvider<T>());
    }

    public static <T> UseCase<T> noCache() {
        return new UseCaseImpl<>(new NoCacheProvider<T>());
    }

    public static <T> UseCase<T> cacheAll() {
        return new UseCaseImpl<>(new CacheAllProvider<T>());
    }

    public static <T> UseCase<T> cacheLast() {
        return new UseCaseImpl<>(new CacheLastProvider<T>());
    }
}
