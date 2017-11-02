package com.pspdfkit.labs.vangogh.api;

import io.reactivex.Completable;

/**
 * Class containing convenient animation scheduling methods.
 */
public final class AnimationSchedulers {

    /**
     * Animates given animations at the same time.
     * @param animations Animations to execute together.
     * @return Completable finishing once the last animation is completed.
     */
    public static Completable together(Completable... animations) {
        return Completable.mergeArray(animations);
    }

    /**
     * Animates given animations one after another
     * @param animations Animations to execute sequentially.
     * @return Completable finishing once the last animation is completed.
     */
    public static Completable sequentially(Completable... animations) {
        return Completable.concatArray(animations);
    }

}
