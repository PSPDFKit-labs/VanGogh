package com.pspdfkit.vangogh.api;

import io.reactivex.Completable;

/**
 * Class containing convenient animation scheduling methods.
 */
public final class AnimationSchedulers {

    public static Completable together(Completable... animations) {
        return Completable.mergeArray(animations);
    }

    public static Completable sequentially(Completable... animations) {
        return Completable.concatArray(animations);
    }

}
